package com.example.paymentgateway.paymentgateway.factory;

import com.example.paymentgateway.paymentgateway.domain.PaymentGatewayEnum;
import com.example.paymentgateway.paymentgateway.strategy.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class PaymentFactory {
    private Map<PaymentGatewayEnum, PaymentStrategy> map;

    @Autowired
    public PaymentFactory(Set<PaymentStrategy> strategySet) {
        createMap(strategySet);
    }

    private void createMap(Set<PaymentStrategy> strategySet) {
        map = new HashMap<>();
        strategySet.stream().forEach(strategy -> {
            map.put(strategy.getType(), strategy);
        });
    }

    public PaymentStrategy getPaymentStrategy(PaymentGatewayEnum paymentGatewayEnum) {
        return map.get(paymentGatewayEnum);
    }
}
