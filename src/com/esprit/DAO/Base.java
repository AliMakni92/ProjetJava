/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.*;
/**
 *
 * @author sana
 */
public interface Base <T>{
    void ajouter(T t) throws SQLException;
    ArrayList<T> readAll()  throws SQLException;
}
