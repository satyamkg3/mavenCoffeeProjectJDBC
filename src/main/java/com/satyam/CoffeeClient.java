package com.satyam;

import com.satyam.pojo.Order;
import com.satyam.presentation.*;

import java.sql.SQLException;
import java.util.Scanner;

public class CoffeeClient {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        Order order = new Order();

        ShowCoffee showCoffee = new ShowCoffee();
        System.out.println("WELCOME!!");
        showCoffee.showCoffeePrice();
        System.out.println("Enter Coffee ID: ");
        order.setCoffeeID(scan.nextInt());


        ShowAddOns showAddOns = new ShowAddOns();
        showAddOns.showAllAddOns();
        System.out.println("Enter AddOn ID: ");
        order.setAddOnsID(scan.nextInt());

        ShowSize showSize = new ShowSize();
        showSize.showSize();
        System.out.println("Enter Size ID");
        order.setSizeID(scan.nextInt());

        ShowCoupons showCoupons = new ShowCoupons();
        showCoupons.showCoupons();
        System.out.println("Enter Coupon ID");
        order.setCoffeeID(scan.nextInt());

        TakeOrder takeOrder = new TakeOrder();
        takeOrder.placeOrder(order);
        takeOrder.showBill(order);
    }
}
