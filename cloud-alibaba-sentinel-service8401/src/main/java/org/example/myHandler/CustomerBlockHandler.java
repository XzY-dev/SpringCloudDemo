package org.example.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.entities.CommonResult;
import org.example.entities.Payment;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.myHandler
 * @date 2020/7/17 22:21
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception){
        return new CommonResult(444,"全局自定义限流------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"全局自定义限流-------2");
    }
}
