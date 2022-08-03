package com.web.tornese.SpringwWeb.servico.Autenticacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import com.web.tornese.SpringwWeb.servico.CookieService;

@Component
public class LoginInterceptor implements HandlerInterceptor{
   
	@Override
	public boolean preHandle
	(HttpServletRequest request, HttpServletResponse response, Object handler )
	throws Exception {
		
		if(CookieService.getCookie(request, "usuarioId") != null) {
			return true;
		}
		response.sendRedirect("/login");
		return false;
	}
	
	
	//@Override
	//public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView )
	//throws Exception {
	//	System.out.println("Post Handle method is Galling");
	//}
	
	//@Override
	//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception eexception )
	//			throws Exception {
    //				System.out.println("Request and Response is completed");
	//}
	
}
