package com.spring.kafka.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    // Annotation required to listen the
    // message from kafka server
    @KafkaListener(topics = "test",
            groupId = "id")
    public void
    publish(String message)
    {
        System.out.println(
                "You have a new message: "
                        + message);
    }
}
