package com.sanyang;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Loginlnterceptor extends HandlerInterceptorAdapter {


	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex)throws Exception {
		super.afterCompletion(request, response, handler, ex);
		System.out.println("��DispatcherServlet��ȫ����������󱻵���,������������Դ��   *   * �����������׳��쳣ʱ,��ӵ�ǰ����������ִ�����е���������afterCompletion() ");
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView )throws Exception {
		
		super.postHandle(request, response, handler, modelAndView);
		System.out.println("��ҵ��������������ִ����ɺ�,������ͼ֮ǰִ�еĶ���  ");
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("��ҵ��������������֮ǰ������ ");
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("�����ʲôʱ�����?");
		 super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
	
}
