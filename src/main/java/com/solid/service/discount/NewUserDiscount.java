package com.solid.service.discount;

public class NewUserDiscount implements Discount{
    @Override
    public double calculate() {
        System.out.println("New user discount: ");
        return 5.0;
    }
}
