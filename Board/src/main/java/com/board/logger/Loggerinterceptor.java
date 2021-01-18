package com.board.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class Loggerinterceptor extends HandlerInterceptorAdapter {

	protected Log log = LogFactory.getLog(Loggerinterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if (log.isDebugEnabled()) {
			log.debug("여기서 시작\n");
			log.debug("*URL ::*" + request.getRequestURL());
		}

		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (log.isDebugEnabled()) {
			log.debug("여기는 끝\n");
			log.debug("*URL ::*" + request.getRequestURL()+"\n");
		}

		super.postHandle(request, response, handler, modelAndView);
	}

}
