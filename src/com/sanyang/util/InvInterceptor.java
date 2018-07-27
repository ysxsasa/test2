package com.sanyang.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sanyang.vo.Userss;

public class InvInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)
				throws Exception{
		try {
			HttpSession session = request.getSession();
			Userss us = (Userss) session.getAttribute("us");
			if (us==null) {
				String uri = request.getRequestURI();
				if (uri.indexOf("querynapwd.sw")>0) {
					return super.preHandle(request, response, handler);
				}else {
					response.sendRedirect("login.jsp");
				}
			}else {
				return super.preHandle(request, response, handler);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
