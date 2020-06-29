package org.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfoTimeout(Integer id){
        //int a = 10/0;
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Thread Pool: "+Thread.currentThread().getName()+"paymentInfo_Timeout,id: "+id;
    }

    /*
     * @Author XZY
     * @Description // 服务降级处理
     * @Param [id]
     * @return java.lang.String
    **/
    public String paymentInfoTimeoutHandler(Integer id){
        return "Thread Pool: "+Thread.currentThread().getName()+"服务超时或者运行异常，稍后再试,id: "+id;
    }
}
