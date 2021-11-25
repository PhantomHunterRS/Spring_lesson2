package com.phantom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    @Bean
    public MessageProvider provider(){
        return new WantMessageProvider();
    }

    public MessageRender render(){
        MessageRender messageRender = new ConsoleMessageRenderImpl();
        messageRender.setMessageProvider(provider());
        return messageRender;
    }
}
