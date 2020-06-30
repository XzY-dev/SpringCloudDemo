package org.example.service;

import cn.hutool.core.util.IdUtil;
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
//-----------服务熔断--------
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallbackMethod", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//开启熔断器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//失败率阈值
    })
    public String paymentCircuitBreaker(Integer id){
        if (id<0){
            throw new RuntimeException("Id 不能为负数！");
        }
        String serialNum = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号为： "+serialNum;
    }

    public String paymentCircuitBreakerFallbackMethod(Integer id){
        return "id 不能为负数，请更换id："+ id;
    }
}
