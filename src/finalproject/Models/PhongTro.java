/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Models;

<<<<<<< HEAD
/**
 *
 * @author Dell
 */
public class PhongTro {
    private int id;
    private String so_phong;
    private String co_so_vat_chat;
    private String tinh_trang_su_dung;
    private String kha_nang_su_dung;
    private int gia_phong;
    private int gia_dien;
    private int gia_nuoc;
    private int phu_thu;
=======
import Shared.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anhvi
 */
public class PhongTro {
    private int id ;
    private int so_phong;
    private String co_so_vat_chat;
    private String tinh_trang_su_dung;
    private String kha_nang_su_dung;
    private float gia_phong;
    private float gia_dien;
    private float gia_nuoc;
    private float phu_thu;
>>>>>>> vanh

    public int getId() {
        return id;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

    public String getSo_phong() {
        return so_phong;
    }

    public void setSo_phong(String so_phong) {
        this.so_phong = so_phong;
    }

=======
    public int getSo_phong() {
        return so_phong;
    }

>>>>>>> vanh
    public String getCo_so_vat_chat() {
        return co_so_vat_chat;
    }

<<<<<<< HEAD
    public void setCo_so_vat_chat(String co_so_vat_chat) {
        this.co_so_vat_chat = co_so_vat_chat;
    }

=======
>>>>>>> vanh
    public String getTinh_trang_su_dung() {
        return tinh_trang_su_dung;
    }

<<<<<<< HEAD
    public void setTinh_trang_su_dung(String tinh_trang_su_dung) {
        this.tinh_trang_su_dung = tinh_trang_su_dung;
    }

=======
>>>>>>> vanh
    public String getKha_nang_su_dung() {
        return kha_nang_su_dung;
    }

<<<<<<< HEAD
=======
    public float getGia_phong() {
        return gia_phong;
    }

    public float getGia_dien() {
        return gia_dien;
    }

    public float getGia_nuoc() {
        return gia_nuoc;
    }

    public float getPhu_thu() {
        return phu_thu;
    }

    public void setSo_phong(int so_phong) {
        this.so_phong = so_phong;
    }

    public void setCo_so_vat_chat(String co_so_vat_chat) {
        this.co_so_vat_chat = co_so_vat_chat;
    }

    public void setTinh_trang_su_dung(String tinh_trang_su_dung) {
        this.tinh_trang_su_dung = tinh_trang_su_dung;
    }

>>>>>>> vanh
    public void setKha_nang_su_dung(String kha_nang_su_dung) {
        this.kha_nang_su_dung = kha_nang_su_dung;
    }

<<<<<<< HEAD
    public int getGia_phong() {
        return gia_phong;
    }

    public void setGia_phong(int gia_phong) {
        this.gia_phong = gia_phong;
    }

    public int getGia_dien() {
        return gia_dien;
    }

    public void setGia_dien(int gia_dien) {
        this.gia_dien = gia_dien;
    }

    public int getGia_nuoc() {
        return gia_nuoc;
    }

    public void setGia_nuoc(int gia_nuoc) {
        this.gia_nuoc = gia_nuoc;
    }

    public int getPhu_thu() {
        return phu_thu;
    }

    public void setPhu_thu(int phu_thu) {
        this.phu_thu = phu_thu;
    }
=======
    public void setGia_phong(float gia_phong) {
        this.gia_phong = gia_phong;
    }

    public void setGia_dien(float gia_dien) {
        this.gia_dien = gia_dien;
    }

    public void setGia_nuoc(float gia_nuoc) {
        this.gia_nuoc = gia_nuoc;
    }

    public void setPhu_thu(float phu_thu) {
        this.phu_thu = phu_thu;
    }

    public PhongTro() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
    }
    
    public PhongTro(int so_phong, String co_so_vat_chat, String tinh_trang_su_dung, String kha_nang_su_dung, float gia_phong, float gia_dien, float gia_nuoc, float phu_thu) {
        this.so_phong = so_phong;
        this.co_so_vat_chat = co_so_vat_chat;
        this.tinh_trang_su_dung = tinh_trang_su_dung;
        this.kha_nang_su_dung = kha_nang_su_dung;
        this.gia_phong = gia_phong;
        this.gia_dien = gia_dien;
        this.gia_nuoc = gia_nuoc;
        this.phu_thu = phu_thu;
    }
    
    public PhongTro getDetailRoom(int idKH) throws SQLException, ClassNotFoundException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select pt.id, pt.so_phong, pt.co_so_vat_chat,"
                + " pt.tinh_trang_su_dung, pt.kha_nang_su_dung, pt.gia_phong,"
                + " pt.gia_dien, pt.gia_nuoc, pt.phu_thu from phongtro pt "
                + " inner join khachhang kh on pt.id = kh.idPT"
                + " where kh.id = " + idKH );
        var a = new PhongTro();
            // show data
        while(rs.first()){
            var res = new PhongTro( rs.getInt(2),rs.getString(3),
                rs.getString(4),rs.getString(5),rs.getFloat(6), rs.getFloat(7),
                rs.getFloat(8), rs.getFloat(9));
            return res;
        }
            
            // close connection
        connection.close();
        return a;
    }
    public void deleteByRoomId(int RoomId)  throws ClassNotFoundException, SQLException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("delete from phongtro where so_phong = " + RoomId );
            // close connection
        connection.close();
    }
    
    public ArrayList<PhongTro> getAll() throws ClassNotFoundException, SQLException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select pt.id, pt.so_phong, pt.co_so_vat_chat,"
                + " pt.tinh_trang_su_dung, pt.kha_nang_su_dung, pt.gia_phong,"
                + " pt.gia_dien, pt.gia_nuoc, pt.phu_thu from phongtro pt "
                + " inner join khachhang kh on pt.id = kh.idPT" );
        var a = new ArrayList<PhongTro>();
            // show data
        while(rs.next()){
            var res = new PhongTro( rs.getInt(2),rs.getString(3),
                rs.getString(4),rs.getString(5),rs.getFloat(6), rs.getFloat(7),
                rs.getFloat(8), rs.getFloat(9));
            a.add(res);
        }
        return a;
    }
    public void addingRoom(PhongTro pt) throws SQLException, ClassNotFoundException{
        var connection = getConnection();
        var stmt = connection.createStatement();
        stmt.executeUpdate("INSERT INTO `phongtro`(so_phong, co_so_vat_chat, "
                + "tinh_trang_su_dung, kha_nang_su_dung, gia_phong, gia_dien, gia_nuoc, phu_thu) "
                + "VALUES (" +  pt.so_phong + ",'"+pt.co_so_vat_chat +"','"
                + pt.tinh_trang_su_dung+"','"+ pt.kha_nang_su_dung +"',"
                + pt.gia_phong+","+pt.gia_dien+","+ pt.gia_nuoc+","+pt.phu_thu+")");
            
            // close connection
        connection.close();
    }
    public PhongTro getRoomById(int roomId) throws ClassNotFoundException, SQLException{
         var connection = getConnection();
        var stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select pt.id, pt.so_phong, pt.co_so_vat_chat,"
                + " pt.tinh_trang_su_dung, pt.kha_nang_su_dung, pt.gia_phong,"
                + " pt.gia_dien, pt.gia_nuoc, pt.phu_thu from phongtro pt "
                + " where id = " + roomId );
        var a = new PhongTro();
            // show data
        while(rs.next()){
            var res = new PhongTro( rs.getInt(2),rs.getString(3),
                rs.getString(4),rs.getString(5),rs.getFloat(6), rs.getFloat(7),
                rs.getFloat(8), rs.getFloat(9));
            return res;
        }
        return a;
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

    @Override
    public String toString() {
        return "PhongTro{" + "id=" + id + ", so_phong=" + so_phong + ", co_so_vat_chat=" + co_so_vat_chat + ", tinh_trang_su_dung=" + tinh_trang_su_dung + ", kha_nang_su_dung=" + kha_nang_su_dung + ", gia_phong=" + gia_phong + ", gia_dien=" + gia_dien + ", gia_nuoc=" + gia_nuoc + ", phu_thu=" + phu_thu + '}';
    }
    
>>>>>>> vanh
}
