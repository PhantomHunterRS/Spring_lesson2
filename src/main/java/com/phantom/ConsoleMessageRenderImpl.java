package com.phantom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConsoleMessageRenderImpl implements MessageRender {

    public ConsoleMessageRenderImpl() {
    }

    public ConsoleMessageRenderImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
    @Autowired
    @Qualifier("Like")
    MessageProvider messageProvider;

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
