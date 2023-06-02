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
}
