package com.learning.kafka.springbootkafkaproducer.controller;


//import com.learning.kafka.springbootkafkaproducer.Producer;
import com.learning.kafka.springbootkafkaproducer.model.Urn;
import com.learning.kafka.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Kafka")
public class Controller {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;


//    @Autowired
//    private Producer producer;

    @Autowired
    KafkaTemplate<String, Urn> kafkaTemplate1;

    private static final String TOPIC = "Kafka_Topic";

    private static  final String TOPIC_JSON = "Kafka_Topic_Json";

    @PostMapping(value = "/publish", consumes = {"application/json"}, produces = {"application/json"})
    public String post(@RequestBody final User user){
        kafkaTemplate.send(TOPIC_JSON, user);
//        this.producer.sendUserMessage(user);
        return "Published Successfully";
    }

    @GetMapping(value = "/publish/urn", consumes = {"application/json"}, produces = {"application/json"})
    public String post(@RequestBody final Urn urn){

        kafkaTemplate1.send(TOPIC, urn);
        System.out.println(urn.getUrn());

        return "Published Successfully";
    }
}
