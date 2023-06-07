/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.admin;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;


/**
 *
 * @author Dell
 */
public class AddUserFrame {
    public AddUserFrame(){
        JFrame addUserFrame = new JFrame("Phòng trọ nhóm 5");
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
        JMenu homeMenu = new JMenu("Home");
        JMenu infoMenu = new JMenu("Quản lý khách hàng");
        JMenu roomMenu = new JMenu("Quản lý phòng");
        JMenu billMenu = new JMenu("Quản lý hóa đơn");
        JMenu messageMenu = new JMenu("Quản lý tin nhắn");
        roomMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListRoomMouseClicked(evt);
            }

            private void viewListRoomMouseClicked(MouseEvent evt) {
                
            }
        });
        billMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListBillMouseClicked(evt);
            }

            private void viewListBillMouseClicked(MouseEvent evt) {
                
            }
        });
        menuBar.add(homeMenu);
        menuBar.add(infoMenu);
        menuBar.add(roomMenu);
        menuBar.add(billMenu);
        menuBar.add(messageMenu);

        
        addUserFrame.setJMenuBar(menuBar);
        
        Font font = new Font("Inter", Font.PLAIN, 28);

        JLabel lb1 = new JLabel("Thêm mới khách hàng");
        lb1.setFont(font);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setBounds(250, 15, 300, 50);
        addUserFrame.add(lb1);

        JPanel pn = new JPanel();
        pn.setBounds(20, 80, 750, 570);
        pn.setBackground(new Color(0, 202, 177));
        pn.setLayout(null);
        addUserFrame.add(pn);

        font = new Font("Inter", Font.BOLD, 15);

        JLabel lb2 = new JLabel("Họ và tên:");
        lb2.setBounds(65, 20, 110, 40);
        lb2.setFont(font);
        pn.add(lb2);

        JTextField tf1 = new JTextField();
        tf1.setBounds(200, 18, 400, 40);
        pn.add(tf1);

        JLabel lb3 = new JLabel("Ngày sinh:");
        lb3.setBounds(65, 70, 110, 40);
        lb3.setFont(font);
        pn.add(lb3);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 68, 400, 40);
        pn.add(tf2);
        
        JLabel lb4 = new JLabel("Số điện thoại:");
        lb4.setBounds(65, 120, 110, 40);
        lb4.setFont(font);
        pn.add(lb4);

        JTextField tf3 = new JTextField();
        tf3.setBounds(200, 118, 400, 40);
        pn.add(tf3);
        
        JLabel lb5 = new JLabel("Số CCCD:");
        lb5.setBounds(65, 170, 110, 40);
        lb5.setFont(font);
        pn.add(lb5);

        JTextField tf4 = new JTextField();
        tf4.setBounds(200, 168, 400, 40);
        pn.add(tf4);
        
        JLabel lb6 = new JLabel("Địa chỉ:");
        lb6.setBounds(65, 220, 110, 40);
        lb6.setFont(font);
        pn.add(lb6);

        JTextField tf5 = new JTextField();
        tf5.setBounds(200, 218, 400, 40);
        pn.add(tf5);
        
        JLabel lb7 = new JLabel("Gmail:");
        lb7.setBounds(65, 270, 110, 40);
        lb7.setFont(font);
        pn.add(lb7);

        JTextField tf6 = new JTextField();
        tf6.setBounds(200, 268, 400, 40);
        pn.add(tf6);
        
        JLabel lb8 = new JLabel("Tên tài khoản:");
        lb8.setBounds(65, 320, 110, 40);
        lb8.setFont(font);
        pn.add(lb8);

        JTextField tf7 = new JTextField();
        tf7.setBounds(200, 318, 400, 40);
        pn.add(tf7);
        
        JLabel lb9 = new JLabel("Mật khẩu:");
        lb9.setBounds(65, 370, 110, 40);
        lb9.setFont(font);
        pn.add(lb9);

        JTextField tf8 = new JTextField();
        tf8.setBounds(200, 368, 400, 40);
        pn.add(tf8);
        
        JLabel lb10 = new JLabel("Phòng:");
        lb10.setBounds(65, 420, 110, 40);
        lb10.setFont(font);
        pn.add(lb10);

        JTextField tf9 = new JTextField();
        tf9.setBounds(200, 418, 400, 40);
        pn.add(tf9);
        
        JButton bt = new JButton("Xác nhận");
        bt.setBounds(325, 480, 100, 50);
        bt.setBackground(new Color(255, 155, 73));
        bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pn.add(bt);
        
        addUserFrame.setBounds(200, 50, 800, 730);
        addUserFrame.setLayout(null);
        addUserFrame.setResizable(false);
        addUserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addUserFrame.setVisible(true);
    }
}
