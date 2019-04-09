/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.DAO;

import com.esprit.entite.Personne;
import java.sql.*;
import com.esprit.utils.DataSource;
import java.util.ArrayList;

/**
 *
 * @author sana
 */
public class PersonneDAO implements Base<Personne>{

    Connection con;
    Statement ste;

    public PersonneDAO() {
        con = DataSource.getInstance();
    }

    public void ajouter(Personne p) throws SQLException {

        ste = con.createStatement();
        String req = "INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`) "
                + "VALUES (NULL, '" + p.getNom() + "', '" + p.getPrenom() 
                + "', '" + p.getAge() + "')";
        ste.executeUpdate(req);
    }

    @Override
    public ArrayList<Personne> readAll() throws SQLException {
    ArrayList<Personne> arrp=new ArrayList<>();
    String req="select * from personne";
     ste = con.createStatement();
     ResultSet rs=ste.executeQuery(req);
     Personne p=null;
        while (rs.next()) {            
   p=new Personne(rs.getInt(1), rs.getString(2), 
           rs.getString(3), rs.getInt(4));
        arrp.add(p);
        }
    
    
    return  arrp;
    }
}
