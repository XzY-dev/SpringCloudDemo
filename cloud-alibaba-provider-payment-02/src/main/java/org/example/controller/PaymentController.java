package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.controller
 * @date 2020/7/12 14:36
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/nacos/{id}")
    public String getServerPort(@PathVariable("id")Integer id){
        return "Nacos registry, server port: "+ serverPort+"\t"+id;
    }
}
