package com.satyam.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    public void dbConnect() throws ClassNotFoundException, SQLException
    {

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemaven?useSSL=false", "root", "admin");
        //preparedStatement = connection.prepareStatement("SELECT * FROM userDetails WHERE ID=?");
    }

}
