package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/21 17:32
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderApplication.class,args);
    }
}
