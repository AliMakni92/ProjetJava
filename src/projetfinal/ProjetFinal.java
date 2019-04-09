/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinal;

import java.sql.*;
import com.esprit.entite.Personne;
import com.esprit.DAO.*;
import java.util.*;
public class ProjetFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Personne p1=new Personne("sana", "ben fadhel", 20);
     PersonneDAO pdao=new PersonneDAO();
     try{
     pdao.ajouter(p1);
     }catch(SQLException ex){
         System.out.println(ex);
     }  try{
     ArrayList<Personne> arrrr=pdao.readAll();
        System.out.println(arrrr);
    }catch(SQLException ex){
         System.out.println(ex);
     }  
     
    }
    
}
