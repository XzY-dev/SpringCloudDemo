package org.example.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.entities
 * @date 2020/6/21 14:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult <T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
