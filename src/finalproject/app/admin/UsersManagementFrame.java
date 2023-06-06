/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.admin;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Dell
 */
public class UsersManagementFrame extends JFrame{
    public UsersManagementFrame(){
        JFrame usersManagementFrame = new JFrame("Quản lý khách hàng");
        usersManagementFrame.setBounds(200,100,800,600);
        
        Font font = new Font("Inter", Font.BOLD, 28);
        
        JLabel lb = new JLabel("Quản lý khách hàng");
        lb.setBounds(250, 15, 300, 50);
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setFont(font);
        usersManagementFrame.add(lb);
        
        JPanel pn = new JPanel();
        pn.setBounds(20, 80, 750, 470);
        pn.setLayout(null);
        pn.setBackground(new Color(0, 202, 177));
        usersManagementFrame.add(pn);
        
        font = new Font("Inter", Font.BOLD, 18);
        JLabel lb1 = new JLabel("Danh sách khách hàng");
        lb1.setFont(font);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setBounds(250, 5, 250, 20);
        pn.add(lb1);
        
        String[] columnsName = {"ID", "Họ và tên", "Ngày sinh", "Số điện thoại", "Ngày thuê", "Trạng thái", ""};
        Object[][] data = 
        {
            {"1","LVH","1/1/2002","012458796","1/1/2022","Đang thuê"},
            {"2","CVA","1/1/2002","012458796","2/1/2022","Đang thuê"}
        };
        
        JTable tb = new JTable(new DefaultTableModel(data, columnsName));
        tb.setBounds(10, 40, 730,370);
        pn.add(tb);
        
        JButton bt1 = new JButton("Thêm");
        bt1.setBounds(450, 420, 70, 40);
        bt1.setBackground(Color.GREEN);
        pn.add(bt1);
        
        JButton bt2 = new JButton("Xóa");
        bt2.setBounds(530, 420, 70, 40);
        bt2.setBackground(Color.RED);
        pn.add(bt2);
        
        usersManagementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usersManagementFrame.setLayout(null);
        usersManagementFrame.setVisible(true);
        usersManagementFrame.setResizable(false);
    }
}
