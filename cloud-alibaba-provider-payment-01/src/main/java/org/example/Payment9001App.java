package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/12 10:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001App {
    public static void main(String[] args) {
        SpringApplication.run(Payment9001App.class, args);
    }
}
