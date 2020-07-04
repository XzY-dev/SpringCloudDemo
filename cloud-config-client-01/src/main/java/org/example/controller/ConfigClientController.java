package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.controller
 * @date 2020/7/4 16:30
 */
@RestController
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
