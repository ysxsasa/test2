package com.sanyang.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.dao.UserDaoImpl;
import com.sanyang.vo.Userss;

@Controller
public class UserHandler {

	@Autowired
	private UserDaoImpl dao;
	
	
	@RequestMapping("querynapwd")
	public String querynapwd(Userss us,HttpServletRequest request) throws Exception{
		
		try {
			us= null;
			System.out.println(us.getUname());
			
			us=dao.querynapwd(us);
			
			if (us==null) {
				System.out.println("��¼ʧ��");
				return "redirect:login.jsp";
			}else {
				System.out.println("��¼�ɹ�");
				HttpSession session = request.getSession();
				session.setAttribute("us", us);
				return "redirect:queryins.sw";
			}
			
		} catch (Exception e) {
			throw new Exception("�����ֶ����õ��쳣~");
		}
		
		
		
	}
	
	
}
