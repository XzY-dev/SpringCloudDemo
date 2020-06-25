package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/25 17:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZooKeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderZooKeeperApplication.class, args);
    }
}
