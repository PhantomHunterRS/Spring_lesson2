package com.phantom;


import com.phantom.config.HelloConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
       MessageRender messageRender = context.getBean(MessageRender.class);
        messageRender.render();
        //context.getBean("render",MessageRender.class).render();
        context.close();
    }
}
