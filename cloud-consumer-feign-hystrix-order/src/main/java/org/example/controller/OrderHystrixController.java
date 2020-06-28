package org.example.controller;

import org.example.service.OrderHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.controller
 * @date 2020/6/28 22:18
 */
@RestController
public class OrderHystrixController {

    @Resource
    private OrderHystrixService orderHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return orderHystrixService.paymentInfo(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id){
        return orderHystrixService.paymentInfoTimeout(id);
    }
}
