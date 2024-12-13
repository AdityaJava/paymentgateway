package com.example.paymentgateway.paymentgateway.domain;

public enum PaymentGatewayEnum {
    G_PAY("G_PAY"),
    PHONE_PAY("PHONE_PAY"),
    AMAZON_PAY("AMAZON_PAY");

    String value;

    PaymentGatewayEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
