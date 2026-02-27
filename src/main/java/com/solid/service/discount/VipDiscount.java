package com.solid.service.discount;

public class VipDiscount implements  Discount{

    @Override
    public double calculate() {
        System.out.println("calculating vip discount...");
        return 30.0;
    }
}
