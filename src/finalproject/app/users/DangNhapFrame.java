/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.users;

import java.awt.*;
import javax.swing.*; 
import finalproject.app.Main_component;


public class DangNhapFrame {
    public DangNhapFrame(){
        JFrame dangNhapFrame = new JFrame("Phần mềm quản lí phòng trọ");
        var main_component = new Main_component("Đăng Nhập");
        dangNhapFrame.add(main_component);
        JLabel loginLb = new JLabel("Tài khoản");
        loginLb.setBounds(300, 150, 200, 50);
        loginLb.setForeground(new Color(185, 232, 97));
        main_component.add(loginLb);
        dangNhapFrame.setBounds(200, 100, 800, 600);
        dangNhapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangNhapFrame.setVisible(true);
    }
    
}
