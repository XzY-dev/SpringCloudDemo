package org.example.service;

import org.example.dao.PaymentDao;
import org.example.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.service
 * @date 2020/6/21 14:46
 */
@Service
public class PaymentServiceImpl {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
