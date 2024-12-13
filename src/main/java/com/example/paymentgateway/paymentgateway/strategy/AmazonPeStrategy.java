package com.example.paymentgateway.paymentgateway.strategy;

import com.example.paymentgateway.paymentgateway.domain.PaymentGatewayEnum;
import org.springframework.stereotype.Service;

@Service
public class AmazonPeStrategy implements PaymentStrategy {
    @Override
    public String pay() {
        return "Paying by Amazon Pay";
    }

    @Override
    public PaymentGatewayEnum getType() {
        return PaymentGatewayEnum.AMAZON_PAY;
    }
}
