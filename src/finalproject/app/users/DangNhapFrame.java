/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.users;

import Shared.Configuration;
import finalproject.Models.KhachHang;
import finalproject.Models.TaiKhoan;
import finalproject.app.admin.adminViewListRoomScreen;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class DangNhapFrame {

    JFrame dangNhapFrame;
    public static int idLogin;

    public DangNhapFrame() {
        dangNhapFrame = new JFrame();
        dangNhapFrame.setTitle("Phòng trọ nhóm 5");
        dangNhapFrame.setBounds(200, 100, 800, 600);

        JPanel pn = new JPanel();
        pn.setLayout(null);
        pn.setBounds(200, 100, 400, 300);
        pn.setBackground(new Color(0, 202, 177));

        Font font = new Font("Inter", Font.BOLD, 35);
        JLabel lb1 = new JLabel("Đăng Nhập");
        lb1.setForeground(Color.white);
        lb1.setFont(font);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setBounds(100, 15, 200, 40);
        pn.add(lb1);

        font = new Font("Inter", Font.BOLD, 18);
        JLabel lb2 = new JLabel("Tên Đăng Nhập:");
        lb2.setForeground(Color.white);
        lb2.setFont(font);
        lb2.setBounds(125, 50, 150, 40);
        lb2.setHorizontalAlignment(SwingConstants.CENTER);
        pn.add(lb2);

        JTextField accountIp = new JTextField();
        accountIp.setBounds(50, 100, 300, 40);
        pn.add(accountIp);

        JLabel lb3 = new JLabel("Mật Khẩu:");
        lb3.setForeground(Color.white);
        lb3.setFont(font);
        lb3.setBounds(125, 150, 150, 40);
        lb3.setHorizontalAlignment(SwingConstants.CENTER);
        pn.add(lb3);

        JPasswordField passwordIp = new JPasswordField();
        passwordIp.setEchoChar('*');
        passwordIp.setBounds(50, 200, 300, 40);
        pn.add(passwordIp);

        JButton bt = new JButton("Đăng nhập");
        bt.setBounds(150, 250, 100, 40);
        bt.setBackground(new Color(255, 155, 73));
        bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pn.add(bt);

        bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    loginMouseClicked(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(DangNhapFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DangNhapFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void loginMouseClicked(MouseEvent evt) throws SQLException, ClassNotFoundException {
                TaiKhoan tk = new TaiKhoan();
                ArrayList<TaiKhoan> ds = tk.getAll();

                for (TaiKhoan t : ds) {
                    if (accountIp.getText().equals(t.getTen_tai_khoan()) && String.valueOf(passwordIp.getPassword()).equals(t.getMat_khau())) {
                        dangNhapFrame.setVisible(false);

                        if (t.getVai_tro() == 0) {
                            var a = new adminViewListRoomScreen();
                        } else {
                            var kh = new KhachHang();
                            idLogin = kh.SelectIdByTentaikhoan(t.getTen_tai_khoan());
                            var a = new UpdateInfoFrame(idLogin);
                        }
                        return;
                    }

                }
                JFrame frame = new JFrame("Thông báo");
                JOptionPane.showMessageDialog(frame,
                        "Sai thông tin đăng nhập",
                        "Lỗi đăng nhập",
                        JOptionPane.ERROR_MESSAGE);

            }

        });

        dangNhapFrame.add(pn);
        dangNhapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangNhapFrame.setLayout(null);
        dangNhapFrame.setVisible(true);
        dangNhapFrame.setResizable(false);
    }

}
