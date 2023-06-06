package finalproject.Models;

import Shared.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anhvi
 */
public class KhachHang {
    private int id;
    private String ho_ten;

    public KhachHang() {
    }
    public String getFullnameByRoomId(int roomId) throws ClassNotFoundException, SQLException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select kh.ho_ten from khachhang kh"
                + " inner join phongtro pt on pt.id =  kh.idPT"
                + " where pt.id = "+ roomId );
            // show data
        while(rs.first()){
            return rs.getString(1);
        }
        return "";
    }
    private Connection getConnection()throws SQLException, ClassNotFoundException{
        
        Connection connection = null;
        if (true){
            Class.forName("com.mysql.jdbc.Driver");
            return connection = DriverManager.getConnection(  
                    "jdbc:mysql://localhost/" + Configuration.dbname,Configuration.user,
                    Configuration.password);
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLPT;user=nhom5;password=12345678;encrypt=false");
    }
}
