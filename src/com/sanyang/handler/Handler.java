package com.sanyang.handler;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sanyang.dao.UserDaoImpl;
import com.sanyang.vo.Userss;


@Controller
public class Handler {

	@Autowired
	private UserDaoImpl dao;
	
	
	@RequestMapping("/querysel")
	public String querysel(Map map) {
		
		List<Userss> list = dao.querysel();
		map.put("list", list);
		return "list";
		
	}

	@RequestMapping("/queryins")
	public String queryins(Userss us,@RequestParam("fs") MultipartFile fs,HttpServletRequest request) {
		
		try {
			System.out.println("上传人:"+us.getUname());
			//得到文件保存的路径
			String path = request.getRealPath("/img/");
			//原始文件名 
			String fname = fs.getOriginalFilename();
			System.out.println("原始文件名："+fname);
			//得到新的文件名
			String newname = this.getNewFilenae()+"."+fname.replace('.', ',').split(",")[1];
			System.out.println("文件存储路径："+path);
			System.out.println("原始文件名："+fname);
			System.out.println("新文件名："+newname);
			//-------将存生的新的文件信息保存到数据库
			us.setImbm(newname);
			us.setImbm(fname);
			us.setImbm(path+"\\"+newname);
			
			//将用户信息保存到数据库
			dao.queryins(us);
			
			//根据当前文件信息创建一个文件对象
			File f = new File(path, newname);
			//进行文件上传
			fs.transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	
	}
	
	private String getNewFilenae(){
		String newname = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHmsS");
			Date d = new Date();
			newname = sdf.format(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return newname;
		
		
	}
	
	
	
	
	
}
