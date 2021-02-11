//package com.learning.kafka.springbootkafkaproducer;
//
//
//import com.learning.kafka.springbootkafkaproducer.model.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Producer {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
//
//    private static  final String TOPIC_JSON = "Kafka_Topic_Json";
//
//    @Autowired
//    KafkaTemplate<String, User> kafkaTemplate;
//
//    public void sendUserMessage(User msg) {
//        LOGGER.info(String.format("\n ===== Producing message in JSON ===== \n"+msg));
//        Message<User> message = MessageBuilder
//                .withPayload(msg)
//                .setHeader(KafkaHeaders.TOPIC, TOPIC_JSON)
//                .build();
//        this.kafkaTemplate.send(message);
//    }
//
//}
