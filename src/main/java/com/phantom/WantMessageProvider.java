package com.phantom;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WantMessageProvider implements MessageProvider {

    @InjectFoodStuff
    String foodStuff;

    public WantMessageProvider() {
        System.out.println("foodStuff from constructor " + foodStuff);
    }

    @PostConstruct
    public void init(){
        System.out.println("foodStuff from init " + foodStuff);
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getMessage() {
        return "I want " + foodStuff;
    }
}
