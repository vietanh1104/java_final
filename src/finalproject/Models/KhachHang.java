package finalproject.Models;

import Shared.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class KhachHang {

    private int id;
    private String ho_ten;
    private Date ngay_sinh;
    private String sdt;
    private String cccd;
    private String dia_chi;
    private String gmail;
    private Date ngay_dang_ki;
    private int trang_thai;
    private int idPT;
    private String ten_tai_khoan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Date getNgay_dang_ki() {
        return ngay_dang_ki;
    }

    public void setNgay_dang_ki(Date ngay_dang_ki) {
        this.ngay_dang_ki = ngay_dang_ki;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }

    public int getIdPT() {
        return idPT;
    }

    public void setIdPT(int idPT) {
        this.idPT = idPT;
    }

    public String getTen_tai_khoan() {
        return ten_tai_khoan;
    }

    public void setTen_tai_khoan(String ten_tai_khoan) {
        this.ten_tai_khoan = ten_tai_khoan;
    }

    public KhachHang() {
    }

    public String getFullnameByRoomId(int roomId) throws ClassNotFoundException, SQLException {
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select kh.ho_ten from khachhang kh"
                + " inner join phongtro pt on pt.id =  kh.idPT"
                + " where pt.id = " + roomId);
        // show data
        while (rs.first()) {
            String res = rs.getString(1);
            connection.close();
            return res;
        }
        connection.close();
        return "";
    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {

        Connection connection = null;
        if (true) {
            Class.forName("com.mysql.jdbc.Driver");
            return connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + Configuration.dbname, Configuration.user,
                    Configuration.password);
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLPT;user=nhom5;password=12345678;encrypt=false");
    }

    public int SelectIdByTentaikhoan(String s) throws SQLException, ClassNotFoundException {
        int id = 0;
        Connection conn = getConnection();
        try {
            var st = conn.createStatement();
            String sql = "SELECT id FROM KhachHang WHERE `ten_tai_khoan` = '" + s+"'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("id");
            }
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return id;
    }

    public KhachHang SelectKHById(int id) throws SQLException, ClassNotFoundException {
        KhachHang kh = new KhachHang();
        Connection conn = getConnection();
        try {
            var st = conn.createStatement();
            String sql = "SELECT * FROM KhachHang WHERE id = " + id;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                kh.setHo_ten(rs.getString("ho_ten"));
                kh.setNgay_sinh(rs.getDate("ngay_sinh"));
                kh.setSdt(rs.getString("sdt"));
                kh.setCccd(rs.getString("cccd"));
                kh.setDia_chi(rs.getString("dia_chi"));
                kh.setGmail(rs.getString("gmail"));
                kh.setNgay_dang_ki(rs.getDate("ngay_dang_ki"));
                kh.setTrang_thai(rs.getInt("trang_thai"));
                kh.setIdPT(rs.getInt("idPT"));
                kh.setTen_tai_khoan(rs.getString("ten_tai_khoan"));
            }
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kh;
    }

    public int UpdateKhachHang(KhachHang k) throws SQLException, ClassNotFoundException {
        int kt = 0;
        Connection conn = getConnection();
        var st = conn.createStatement();
        String sql = "UPDATE KhachHang SET ho_ten='" + k.getHo_ten() + "',ngay_sinh='" + k.getNgay_sinh() + "',sdt='" + k.getSdt() + "',cccd='" + k.getCccd() + "',dia_chi='" + k.getDia_chi() + "',gmail='" + k.getGmail() + "',ten_tai_khoan='" + k.getTen_tai_khoan() + "' WHERE `idKH` = " + k.getId();
        kt = st.executeUpdate(sql);
        conn.close();
        return kt;
    }
}
