package com.guiqi.springcloud.service;

import com.guiqi.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int create(Payment payment);

    Payment queryById(@Param("id")long id);
}
