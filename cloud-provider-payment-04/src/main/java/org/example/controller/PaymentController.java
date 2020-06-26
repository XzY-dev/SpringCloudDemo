package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.controller
 * @date 2020/6/26 14:09
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "Spring Cloud with Consul:"+ serverPort+ "\t"+ UUID.randomUUID().toString();
    }
}
