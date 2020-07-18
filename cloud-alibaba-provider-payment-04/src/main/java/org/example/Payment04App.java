package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/18 16:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment04App {
    public static void main(String[] args) {
        SpringApplication.run(Payment04App.class, args);
    }
}
