package com.nearsoft.hellokafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.test}")
    String kafkaTopic;

    public void send(String message) {
        kafkaTemplate.send(kafkaTopic, message);
    }
}
