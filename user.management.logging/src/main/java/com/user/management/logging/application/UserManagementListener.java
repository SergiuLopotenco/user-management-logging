package com.user.management.logging.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserManagementListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        log.info("Consumed message from [user.queue] --> " + new String(message.getBody()));
    }
}
