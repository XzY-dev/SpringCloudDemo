package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/26 14:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication04 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication04.class, args);
    }
}
