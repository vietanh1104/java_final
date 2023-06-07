/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Models;



import Shared.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.util.ArrayList;

import java.util.Date;

/**
 *
<<<<<<< HEAD
 * @author Dell
=======
 * @author anhvi

 */
public class HoaDon {
    private int id;
    private int so_dien;
    private int so_nuoc;
    private Date ngay_tao;
    private Date han_dong;
    private int idPT;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public HoaDon(int id, int so_dien, int so_nuoc, Date ngay_tao, Date han_dong, int idPT) {
        this.id = id;
        this.so_dien = so_dien;
        this.so_nuoc = so_nuoc;
        this.ngay_tao = ngay_tao;
        this.han_dong = han_dong;
        this.idPT = idPT;
    }

    public HoaDon() {
    }

    public int getSo_dien() {
        return so_dien;
    }

    public void setSo_dien(int so_dien) {
        this.so_dien = so_dien;
    }

    public int getSo_nuoc() {
        return so_nuoc;
    }

    public void setSo_nuoc(int so_nuoc) {
        this.so_nuoc = so_nuoc;
    }
    public Date getNgay_tao() {
        return ngay_tao;
    }

    public void setNgay_tao(Date ngay_tao) {
        this.ngay_tao = ngay_tao;
    }


    public Date getHan_dong() {
        return han_dong;
    }


    public void setHan_dong(Date han_dong) {
        this.han_dong = han_dong;
    }


    public int getIdPT() {
        return idPT;
    }


    public void setIdPT(int idPT) {
        this.idPT = idPT;
    }


 
    public ArrayList<HoaDon> getAll() throws ClassNotFoundException, SQLException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from hoadon" );
        var a = new ArrayList<HoaDon>();
        
            // show data
        while(rs.next()){
            var res = new HoaDon( rs.getInt(1), rs.getInt(2),rs.getInt(3),
                rs.getDate(4),rs.getDate(5),rs.getInt(6));
            a.add(res);
        }
        return a;
    }
    public float getTotalBill(int billId) throws ClassNotFoundException, SQLException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select (pt.gia_phong + pt.gia_dien * hd.so_dien "
                + "+ pt.gia_nuoc * hd.so_nuoc + pt.phu_thu) from hoadon hd"
                + " inner join phongtro pt on pt.id = hd.idPT"
                + " where hd.id = " +billId );
            // show data
        while(rs.first()){
            float res = rs.getFloat(1);
            connection.close();
            return res;
        }
        connection.close();
        return 0;
    }
    public void addingBill(HoaDon pt) throws SQLException, ClassNotFoundException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        stmt.executeUpdate("INSERT INTO hoadon(so_dien, so_nuoc, ngay_tao, han_dong, idPT) "
                + "VALUES (" +100+","+50+",'2023/06/07','2023/06/29',"+ pt.getIdPT());
            
            // close connection
        connection.close();
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
