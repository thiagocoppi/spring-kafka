package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaWorkerSetup {
    public static void main(String[] args) {
        SpringApplication.run(KafkaWorkerSetup.class , args);
    }
}
