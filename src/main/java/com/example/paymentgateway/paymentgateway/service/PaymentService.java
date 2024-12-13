package com.example.paymentgateway.paymentgateway.service;

import com.example.paymentgateway.paymentgateway.domain.Payment;
import com.example.paymentgateway.paymentgateway.factory.PaymentFactory;
import com.example.paymentgateway.paymentgateway.strategy.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private final PaymentFactory paymentFactory;

    @Autowired
    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public String pay(Payment payment) {
        PaymentStrategy paymentStrategy = paymentFactory.getPaymentStrategy(payment.getPaymentGatewayEnum());
        return paymentStrategy.pay();
    }
}
