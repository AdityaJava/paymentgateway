package com.example.paymentgateway.paymentgateway.strategy;

import com.example.paymentgateway.paymentgateway.domain.PaymentGatewayEnum;
import org.springframework.stereotype.Service;

@Service
public class Phonepay implements PaymentStrategy {
    @Override
    public String pay() {
        return "Paying by Phone pay";
    }

    @Override
    public PaymentGatewayEnum getType() {
        return PaymentGatewayEnum.PHONE_PAY;
    }
}