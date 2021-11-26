package com.phantom;

import org.springframework.stereotype.Component;

@Component("Like")
public class LikeMessageProviderImpl implements MessageProvider {


    @InjectFoodStuff
    String foodStuff;

    @Override
    public String getMessage() {
        return "I Like cookies and cheesecake " + foodStuff;
    }
}
