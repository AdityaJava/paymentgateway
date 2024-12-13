package com.example.paymentgateway.paymentgateway.controller;

import com.example.paymentgateway.paymentgateway.domain.Payment;
import com.example.paymentgateway.paymentgateway.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentGatewayController {

    private  final PaymentService paymentService;

    @Autowired
    public PaymentGatewayController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String pay(@RequestBody Payment payment) {
       return paymentService.pay(payment);
    }

}
