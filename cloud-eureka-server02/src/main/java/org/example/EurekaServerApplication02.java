package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/22 21:15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication02.class, args);
    }
}
