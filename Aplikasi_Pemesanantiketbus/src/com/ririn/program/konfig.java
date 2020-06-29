/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ririn.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class konfig {
    
    private static Connection MYSQlConfig;
    
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/pemesanan_tiketbus";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQlConfig =DriverManager.getConnection(url, user , pass);
        }catch (SQLException e){
    System.out.println("Koneksi ke Database gagal" + e.getMessage());
    }
        
        return MYSQlConfig;
}
}
