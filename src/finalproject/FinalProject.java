/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author anhvi
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        var a = new finalproject.Models.TaiKhoan();
        try {
            a.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(FinalProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
