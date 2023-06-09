package com.example.emailservice.kafka;

import com.example.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId="${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){
        logger.info(String.format("Email event received in email service => %s", event.toString()));
    }
}
