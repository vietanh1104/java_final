/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Models;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class TinNhan {
    private int id;
    private String noi_dung;
    private Date thoi_gian;  
    private int trang_thai;
    private int idKH;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public Date getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(Date thoi_gian) {
        this.thoi_gian = thoi_gian;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }
    
}
