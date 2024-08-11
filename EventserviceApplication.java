package com.jiosnap.eventservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@ComponentScan("com.jiosnap.eventservice")
@EnableDiscoveryClient
@EnableScheduling
public class EventserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventserviceApplication.class, args);
    }
}

