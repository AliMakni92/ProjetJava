/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataSource {

    private String url = "jdbc:mysql://localhost:3306/eprit";
    private String login = "root";
    private String pwd = "";
    private static Connection con;

    private DataSource() {
        try {
            con = DriverManager.
                    getConnection(url, login, pwd);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static Connection getInstance() {
        if (con == null) {
            new DataSource();
        }
        return con;
    }
}
