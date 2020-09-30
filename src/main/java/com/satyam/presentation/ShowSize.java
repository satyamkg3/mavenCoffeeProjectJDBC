package com.satyam.presentation;

import com.satyam.pojo.Size;
import com.satyam.service.SizeBL;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowSize {
    private SizeBL sizeBL = new SizeBL();
    private ArrayList<Size> sizeArr;
    private Size size;

    public void showSize() throws SQLException, ClassNotFoundException {
        sizeArr = sizeBL.getAllSize();
        System.out.println("Available size of coffee are: ");
        for(Size temp: sizeArr)
        {
            System.out.println(temp.getSizeID()+" "+temp.getSizeName());
        }
    }
}
