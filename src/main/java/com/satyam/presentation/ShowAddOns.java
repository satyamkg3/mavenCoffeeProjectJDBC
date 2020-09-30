package com.satyam.presentation;

import com.satyam.pojo.AddOns;
import com.satyam.service.AddOnBL;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowAddOns {
    private AddOnBL addOnBL = new AddOnBL();
    private ArrayList<AddOns> addOns;

    public void showAllAddOns() throws SQLException, ClassNotFoundException {
        addOns = addOnBL.getAllAddOns();
        System.out.println("Available addOns are: ");
        for(AddOns temp: addOns) {
            System.out.println(temp.getAddOnsID()+") "+temp.getAddOnsName());
        }
    }
}
