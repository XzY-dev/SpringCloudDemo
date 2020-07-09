package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example
 * @date 2020/7/9 22:19
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer03App {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer03App.class, args);
    }
}
