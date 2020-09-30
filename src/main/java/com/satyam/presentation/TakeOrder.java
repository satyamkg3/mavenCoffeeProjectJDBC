package com.satyam.presentation;

import com.satyam.pojo.Order;
import com.satyam.service.OrderBL;

import java.sql.SQLException;
import java.util.ArrayList;

public class TakeOrder {

    private OrderBL orderBL = new OrderBL();

    public void placeOrder(Order order) throws SQLException, ClassNotFoundException {
        ArrayList<String> arrayList;
        arrayList = orderBL.getDetails(order);
        System.out.println("Coffee: "+arrayList.get(0));
        System.out.println("AddOn: "+arrayList.get(1));
        System.out.println("Size: "+arrayList.get(2));
        System.out.println("Coupon: "+arrayList.get(3));
    }
    public void showBill(Order order) throws SQLException, ClassNotFoundException {
        double bill = orderBL.calculateBill(order);
        System.out.println("Bill: "+ bill);
    }
}
