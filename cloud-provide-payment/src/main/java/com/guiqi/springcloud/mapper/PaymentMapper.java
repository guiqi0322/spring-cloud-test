package com.guiqi.springcloud.mapper;

import com.guiqi.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentMapper  {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
