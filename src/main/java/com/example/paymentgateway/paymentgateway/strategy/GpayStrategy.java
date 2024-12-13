package com.example.paymentgateway.paymentgateway.strategy;

import com.example.paymentgateway.paymentgateway.domain.PaymentGatewayEnum;
import org.springframework.stereotype.Service;

@Service
public class GpayStrategy implements PaymentStrategy {
    @Override
    public String pay() {
        return "Paying by Google pay";
    }

    @Override
    public PaymentGatewayEnum getType() {
        return PaymentGatewayEnum.G_PAY;
    }
}
