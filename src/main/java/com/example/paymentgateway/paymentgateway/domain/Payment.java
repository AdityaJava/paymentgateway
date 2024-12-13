package com.example.paymentgateway.paymentgateway.domain;

public class Payment {
    private Long amount;
    private PaymentGatewayEnum paymentGatewayEnum;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public PaymentGatewayEnum getPaymentGatewayEnum() {
        return paymentGatewayEnum;
    }

    public void setPaymentGatewayEnum(PaymentGatewayEnum paymentGatewayEnum) {
        this.paymentGatewayEnum = paymentGatewayEnum;
    }
}
