package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/15 22:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelService8848 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelService8848.class, args);
    }
}
