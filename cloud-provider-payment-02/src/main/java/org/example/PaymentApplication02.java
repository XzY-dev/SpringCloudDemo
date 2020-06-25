package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/20 22:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication02.class,args);
    }
}
