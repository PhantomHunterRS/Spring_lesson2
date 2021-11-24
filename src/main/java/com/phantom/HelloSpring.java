package com.phantom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       MessageRender messageRender = context.getBean(MessageRender.class);
        messageRender.render();
        //context.getBean("render",MessageRender.class).render();
    }
}
