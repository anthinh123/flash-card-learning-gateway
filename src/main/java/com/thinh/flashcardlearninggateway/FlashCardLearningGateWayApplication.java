package com.thinh.flashcardlearninggateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlashCardLearningGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashCardLearningGateWayApplication.class, args);
    }
}
