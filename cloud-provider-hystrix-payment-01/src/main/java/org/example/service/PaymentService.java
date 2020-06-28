package org.example.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.service
 * @date 2020/6/28 21:34
 */
@Service
public class PaymentService {
    /*
     * @Author XZY
     * @Description //TODO 正常访问
     * @Param [id]
     * @return java.lang.String
    **/
    public String paymentInfo(Integer id){
        return "Thread Pool: "+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id;
    }

    /*
     * @Author XZY
     * @Description //TODO 超时访问
     * @Param [id]
     * @return java.lang.String
    **/
    public String paymentInfoTimeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Thread Pool: "+Thread.currentThread().getName()+"paymentInfo_Timeout,id: "+id;
    }
}
