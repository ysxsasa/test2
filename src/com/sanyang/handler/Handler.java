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
			System.out.println("�ϴ���:"+us.getUname());
			//�õ��ļ������·��
			String path = request.getRealPath("/img/");
			//ԭʼ�ļ��� 
			String fname = fs.getOriginalFilename();
			System.out.println("ԭʼ�ļ�����"+fname);
			//�õ��µ��ļ���
			String newname = this.getNewFilenae()+"."+fname.replace('.', ',').split(",")[1];
			System.out.println("�ļ��洢·����"+path);
			System.out.println("ԭʼ�ļ�����"+fname);
			System.out.println("���ļ�����"+newname);
			//-------���������µ��ļ���Ϣ���浽���ݿ�
			us.setImbm(newname);
			us.setImbm(fname);
			us.setImbm(path+"\\"+newname);
			
			//���û���Ϣ���浽���ݿ�
			dao.queryins(us);
			
			//���ݵ�ǰ�ļ���Ϣ����һ���ļ�����
			File f = new File(path, newname);
			//�����ļ��ϴ�
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
