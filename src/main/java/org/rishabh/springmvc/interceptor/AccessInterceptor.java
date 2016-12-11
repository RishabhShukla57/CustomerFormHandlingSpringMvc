package org.rishabh.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rishabh.springmvc.model.LoginForm;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		if(!request.getRequestURI().equalsIgnoreCase("/springmvc/loginFailed.html") &&
				!request.getRequestURI().equalsIgnoreCase("/springmvc/loginFormCheck.html") &&
				!request.getRequestURI().equalsIgnoreCase("/springmvc/loginCheck.html") &&
				!request.getRequestURI().equalsIgnoreCase("springmvc/loginSuccess.html")){
				LoginForm loginForm	 = (LoginForm) request.getSession().getAttribute("LOGIN_INF");
			if(loginForm==null){
				response.sendRedirect("/loginFailed.html");
				return false;
			}
			
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
		System.out.println("How did you access this website");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		System.out.println("You fucking moron");
	}

}
