package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/5 15:20
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication02.class, args);
    }
}
