package com.guiqi.springcloud.service;

import com.guiqi.springcloud.mapper.PaymentMapper;
import com.guiqi.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentImpl implements PaymentService{
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentMapper.queryById(id);
    }
}
