package com.satyam.service;

import com.satyam.persistense.*;
import com.satyam.pojo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeBL {

    private CoffeeDaoImpl coffeeDao = new CoffeeDaoImpl();

    public ArrayList getAllCoffeeList() throws SQLException, ClassNotFoundException {
        ArrayList<Coffee> coffeeList = new ArrayList<>();

        coffeeList = coffeeDao.getAllCoffee();
        return coffeeList;
    }
    public ArrayList getAllCoffeePriceList() throws SQLException, ClassNotFoundException {
        ArrayList<Coffee> coffeeList = new ArrayList<>();

        coffeeList = coffeeDao.getCoffeePrice();
        return coffeeList;
    }
}
