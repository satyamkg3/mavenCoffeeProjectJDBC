package com.satyam.presentation;

import com.satyam.persistense.AddOnsDaoImpl;
import com.satyam.persistense.CoffeeDaoImpl;
import com.satyam.pojo.AddOns;
import com.satyam.pojo.Coffee;
import com.satyam.service.CoffeeBL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class ShowCoffee {

        private CoffeeBL coffeeBL = new CoffeeBL();


    public void showCoffeeNames() throws SQLException, ClassNotFoundException {
        ArrayList<Coffee> coffee = new ArrayList<>();
            coffee = coffeeBL.getAllCoffeeList();
            System.out.println("Available coffee are: ");
            for(Coffee temp: coffee)
            {
                System.out.println(temp.getCoffeeName());
            }
        }
        public void showCoffeePrice () throws SQLException, ClassNotFoundException {
            ArrayList<Coffee> coffee = new ArrayList<>();
            coffee = coffeeBL.getAllCoffeePriceList();
            for(Coffee temp: coffee)
            {
                //System.out.println("Price of " + temp.getCoffeeName() + " is :" + temp.getPrice());
                System.out.println(temp.getCoffeeID()+") "+temp.getCoffeeName()+", Price: "+temp.getPrice());
            }
        }
    }