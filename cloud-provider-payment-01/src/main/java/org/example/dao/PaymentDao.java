package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entities.Payment;

/**
 * @author XZY
 * @version V1.0
 * @Package org.example.dao
 * @date 2020/6/21 14:36
 */
@Mapper
public interface PaymentDao {
     public int create(Payment payment);
     public Payment getPaymentById(@Param("id") Long id);
}
