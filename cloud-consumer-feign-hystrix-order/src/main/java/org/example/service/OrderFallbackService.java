package org.example.service;

import org.springframework.stereotype.Component;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.service
 * @date 2020/6/29 22:23
 */
@Component
public class OrderFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfo(Integer id) {
        return "OrderFallbackService fall back paymentInfo 宕机";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "OrderFallbackService fall back paymentInfoTimeout 宕机";
    }
}
