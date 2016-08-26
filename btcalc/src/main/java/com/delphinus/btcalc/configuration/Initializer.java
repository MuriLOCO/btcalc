package com.delphinus.btcalc.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {
	
	@Override
    public void onStartup(ServletContext container) {
		
		final AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.register(WebApplicationConfiguration.class);
		
		final ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("*.html");
		
	}	

}
