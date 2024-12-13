package com.example.paymentgateway.paymentgateway.strategy;

import com.example.paymentgateway.paymentgateway.domain.PaymentGatewayEnum;

public interface PaymentStrategy {
    String pay();

    PaymentGatewayEnum getType();
}
