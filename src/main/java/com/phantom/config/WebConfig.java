package com.phantom.config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Slf4j
public class WebConfig implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("WebConfig - onStartUp");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    }
}
