package org.example.service;

import org.example.entities.CommonResult;
import org.example.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.service
 * @date 2020/7/18 17:47
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult(444,"服务降级 ---> PaymentFallbackService");
    }
}
