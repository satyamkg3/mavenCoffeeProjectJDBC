package com.satyam.persistense;

import com.satyam.pojo.Discount;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DiscountDao {
    ArrayList searchDiscount() throws ClassNotFoundException, SQLException;
    //Discount searchDiscount(int id) throws ClassNotFoundException, SQLException;

}
