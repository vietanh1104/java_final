/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.admin;

import finalproject.Views.DSTinNhanAdminView;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class UsersManagementFrame extends JFrame {

    public UsersManagementFrame() {
        setBounds(200, 100, 800, 650);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
        JMenu homeMenu = new JMenu("Home");
        JMenu cusMenu = new JMenu("Quản lý khách hàng");
        JMenu infoMenu = new JMenu("Quản lý khách hàng");
        JMenu roomMenu = new JMenu("Quản lý phòng");
        JMenu billMenu = new JMenu("Quản lý hóa đơn");
        JMenu messageMenu = new JMenu("Quản lý tin nhắn");
        roomMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListRoomMouseClicked(evt);
            }
        });

        billMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListBillMouseClicked(evt);
            }
        });
        messageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListMessageMouseClicked(evt);
            }
        });
        menuBar.add(homeMenu);
        menuBar.add(infoMenu);
        menuBar.add(roomMenu);
        menuBar.add(billMenu);
        menuBar.add(messageMenu);

        setJMenuBar(menuBar);

        Font font = new Font("Inter", Font.BOLD, 28);

        JLabel lb = new JLabel("Quản lý khách hàng");
        lb.setBounds(250, 15, 300, 50);
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setFont(font);
        add(lb);

        JPanel pn = new JPanel();
        pn.setBounds(20, 80, 750, 470);
        pn.setLayout(null);
        pn.setBackground(new Color(0, 202, 177));
        add(pn);

        font = new Font("Inter", Font.BOLD, 18);
        JLabel lb1 = new JLabel("Danh sách khách hàng");
        lb1.setFont(font);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setBounds(250, 5, 250, 20);
        pn.add(lb1);

        String[] columnsName = {"ID", "Họ và tên", "Ngày sinh", "Số điện thoại", "Ngày thuê", "Trạng thái"};
        Object[][] data
                = {
                    {"1", "LVH", "1/1/2002", "012458796", "1/1/2022", "Đang thuê"},
                    {"2", "CVA", "1/1/2002", "012458796", "2/1/2022", "Đang thuê"}
                };

        JTable tb = new JTable(new DefaultTableModel(data, columnsName));
        tb.setBounds(10, 40, 730, 370);
        pn.add(tb);

        JButton bt1 = new JButton("Thêm");
        bt1.setBounds(450, 420, 70, 40);
        bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt1.setBackground(Color.GREEN);
        pn.add(bt1);

        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMessageMouseClicked(evt);
            }
        });

        JButton bt3 = new JButton("Chi tiết");
        bt3.setBounds(530, 420, 80, 40);
        bt3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt3.setBackground(Color.ORANGE);
        pn.add(bt3);
        
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userDetailMessageMouseClicked(evt);
            }
        });

        JButton bt2 = new JButton("Xóa");
        bt2.setBounds(620, 420, 70, 40);
        bt2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt2.setBackground(Color.RED);
        pn.add(bt2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    private void viewListRoomMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            this.setVisible(false);
            var a = new adminViewListRoomScreen();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void viewListBillMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            this.setVisible(false);
            var a = new adminBillViewListScreen();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void viewListMessageMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        var a = new DSTinNhanAdminView();
        a.setVisible(true);
    }

    private void addUserMessageMouseClicked(MouseEvent evt) {
        this.setVisible(false);
        var a = new AddUserFrame();
    }
    private void userDetailMessageMouseClicked(MouseEvent evt) {
        this.setVisible(false);
        int id = 2;
        var a = new UserDetailFrame(id);
    }
}
