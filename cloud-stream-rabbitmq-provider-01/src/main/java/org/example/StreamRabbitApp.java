package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/8 23:00
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitApp {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitApp.class, args);
    }
}
