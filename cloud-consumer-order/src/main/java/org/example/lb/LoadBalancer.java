package org.example.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.lb
 * @date 2020/6/26 17:44
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
