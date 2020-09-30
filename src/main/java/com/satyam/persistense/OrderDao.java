package com.satyam.persistense;

import com.satyam.pojo.Order;

import java.sql.SQLException;

public interface OrderDao {
    void insertOrder(Order order,double bill) throws ClassNotFoundException, SQLException;
}
