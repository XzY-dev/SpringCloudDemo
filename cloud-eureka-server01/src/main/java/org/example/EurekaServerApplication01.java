package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/6/21 18:44
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication01.class, args);
    }
}
