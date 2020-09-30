package com.satyam.service;

import com.satyam.persistense.DiscountDaoImpl;
import com.satyam.pojo.Discount;

import java.sql.SQLException;
import java.util.ArrayList;

public class DiscountBL {

    private DiscountDaoImpl discountDao = new DiscountDaoImpl();

    public ArrayList showCoupons() throws SQLException, ClassNotFoundException {
        ArrayList<Discount> discountArray;
        discountArray = discountDao.searchDiscount();
        return discountArray;
    }
}
