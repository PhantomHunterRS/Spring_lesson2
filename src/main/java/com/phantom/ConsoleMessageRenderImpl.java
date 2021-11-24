package com.phantom;

public class ConsoleMessageRenderImpl implements MessageRender {

    public ConsoleMessageRenderImpl() {
    }

    public ConsoleMessageRenderImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

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
