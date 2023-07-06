package com.dependency;

import services.MGDeductionService;
import services.PayService;
import services.SPDeductionService;

public class Program {

    public static void main(String[] args) {

        PayService payService = new PayService(new SPDeductionService());

        double tax = payService.tax(1000.0);

        System.out.println(tax);
    }
}
