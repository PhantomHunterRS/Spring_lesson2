package com.phantom;

public class LikeMessageProviderImpl implements MessageProvider {


    @InjectFoodStuff
    String foodStuff;

    @Override
    public String getMessage() {
        return "I Like cookies and cheesecake " + foodStuff;
    }
}
