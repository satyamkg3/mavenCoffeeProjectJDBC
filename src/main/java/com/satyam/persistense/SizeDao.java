package com.satyam.persistense;

import com.satyam.pojo.Size;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SizeDao {
    ArrayList getAllSize() throws ClassNotFoundException, SQLException;
    Size getPrice(int id) throws ClassNotFoundException, SQLException;

}
