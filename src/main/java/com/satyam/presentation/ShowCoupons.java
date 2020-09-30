package com.satyam.presentation;

import com.satyam.pojo.Discount;
import com.satyam.service.DiscountBL;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowCoupons {
    private Discount discount = new Discount();
    private DiscountBL discountBL = new DiscountBL();

    public void showCoupons() throws SQLException, ClassNotFoundException {
        ArrayList<Discount> discountArray;
        discountArray = discountBL.showCoupons();
        for (Discount temp : discountArray) {
            System.out.println(temp.getCouponID() +") "+temp.getCouponName()+"  Discount " + temp.getPercentage() + " off.");
        }
    }
}
