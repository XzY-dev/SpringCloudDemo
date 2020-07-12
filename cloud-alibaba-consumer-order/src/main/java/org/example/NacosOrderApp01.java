package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/12 15:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApp01 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApp01.class, args);
    }
}
