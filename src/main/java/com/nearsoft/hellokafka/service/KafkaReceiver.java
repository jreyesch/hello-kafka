package com.nearsoft.hellokafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {
    private static final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(id = "testTopic", topics = "${topic.test}")
    public void receive(@Payload String message){
        logger.info("  >>>> Received: {}", message);
    }
}
