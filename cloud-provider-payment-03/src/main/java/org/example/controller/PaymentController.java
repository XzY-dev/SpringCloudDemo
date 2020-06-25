package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.controller
 * @date 2020/6/25 16:07
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZoo(){
        return "Spring Cloud with ZooKeeper:"+ serverPort+ "\t"+ UUID.randomUUID().toString();
    }
}
