package com.simplilearn.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// not using  web.xml
public class WebAppIntialiizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {WebConfig.class};
		 }

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
