/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Models;

import Shared.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author anhvi
 */
public class TaiKhoan {
    private String ten_tai_khoan;
    private String mat_khau;
    private String vai_tro;

    public String getTen_tai_khoan() {
        return ten_tai_khoan;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public String getVai_tro() {
        return vai_tro;
    }

    public void setTen_tai_khoan(String ten_tai_khoan) {
        this.ten_tai_khoan = ten_tai_khoan;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public void setVai_tro(String vai_tro) {
        this.vai_tro = vai_tro;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(String ten_tai_khoan, String mat_khau, String vai_tro) {
        this.ten_tai_khoan = ten_tai_khoan;
        this.mat_khau = mat_khau;
        this.vai_tro = vai_tro;
    }
    
    public ArrayList<TaiKhoan> getAll() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");  
        var connection = DriverManager.getConnection(  
                    "jdbc:mysql://localhost/" + Configuration.dbname,Configuration.user,
                    Configuration.password);
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from students");
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            // close connection
            connection.close();
        return new ArrayList<TaiKhoan>();
    }  
}
