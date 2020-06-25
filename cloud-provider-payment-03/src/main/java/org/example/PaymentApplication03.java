package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/25 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication03 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication03.class, args);
    }
}
