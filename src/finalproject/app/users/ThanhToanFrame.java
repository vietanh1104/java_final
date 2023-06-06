/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.users;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class ThanhToanFrame extends JFrame{

    public ThanhToanFrame() {
        JFrame thanhToanFrame = new JFrame("Phòng trọ nhóm 5");
        thanhToanFrame.setBounds(200, 100, 800, 600);
        
        Font font = new Font("Inter", Font.BOLD, 28);
        
        JLabel lb = new JLabel("Hóa Đơn");
        lb.setBounds(250, 15, 300, 50);
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setFont(font);
        thanhToanFrame.add(lb);
        
        JPanel pn = new JPanel();
        pn.setBounds(20, 80, 750, 470);
        pn.setLayout(null);
        pn.setBackground(new Color(0, 202, 177));
        thanhToanFrame.add(pn);
        
        font = new Font("Inter", Font.BOLD, 15);
        
        JLabel lb1 = new JLabel("Tiền phòng:");
        lb1.setFont(font);
        lb1.setBounds(65, 50, 100, 40);
        pn.add(lb1);
        
        JTextField tf1 = new JTextField();
        tf1.setBounds(200, 50, 300, 40);
        pn.add(tf1);
        
        JLabel lb2 = new JLabel("Tiền điện:");
        lb2.setFont(font);
        lb2.setBounds(65, 100, 100, 40);
        pn.add(lb2);
        
        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 100, 300, 40);
        pn.add(tf2);
        
        JLabel lb3 = new JLabel("Tiền nước:");
        lb3.setFont(font);
        lb3.setBounds(65, 150, 100, 40);
        pn.add(lb3);
        
        JTextField tf3 = new JTextField();
        tf3.setBounds(200, 150, 300, 40);
        pn.add(tf3);
        
        JLabel lb4 = new JLabel("Tiền phụ thu:");
        lb4.setFont(font);
        lb4.setBounds(65, 200, 100, 40);
        pn.add(lb4);
        
        JTextField tf4 = new JTextField();
        tf4.setBounds(200, 200, 300, 40);
        pn.add(tf4);
        
        JLabel lb5 = new JLabel("Tổng tiền:");
        lb5.setFont(font);
        lb5.setBounds(65, 250, 100, 40);
        pn.add(lb5);
        
        JTextField tf5 = new JTextField();
        tf5.setBounds(200, 250, 300, 40);
        pn.add(tf5);
        
        JLabel lb6 = new JLabel("Trạng thái:");
        lb6.setFont(font);
        lb6.setBounds(65, 300, 100, 40);
        pn.add(lb6);
        
        JTextField tf6 = new JTextField();
        tf6.setBounds(200, 300, 300, 40);
        pn.add(tf6);
        
        JButton bt = new JButton("Quay lại");
        bt.setBounds(550, 400, 100, 40);
        bt.setBackground(new Color(255, 155, 73));
        bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pn.add(bt);
        
        thanhToanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thanhToanFrame.setLayout(null);
        thanhToanFrame.setVisible(true);
        thanhToanFrame.setResizable(false);
    }
}