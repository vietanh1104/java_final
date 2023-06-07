package finalproject.app.users;

import finalproject.Models.KhachHang;
import finalproject.Models.TaiKhoan;
import finalproject.app.admin.adminViewListRoomScreen;
import static finalproject.app.users.DangNhapFrame.idLogin;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class UpdateInfoFrame {

    private KhachHang kh = new KhachHang();

    public UpdateInfoFrame(int id) throws SQLException, ClassNotFoundException {
        
        JFrame updateFrame = new JFrame("Phòng trọ nhóm 5");
        Font font = new Font("Inter", Font.PLAIN, 28);
        kh = kh.SelectKHById(id);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
        JMenu homeMenu = new JMenu("Home");
        JMenu infoMenu = new JMenu("Thông tin cá nhân");
        JMenu billMenu = new JMenu("Hóa đơn");
        JMenu roomMenu = new JMenu("Thông tin phòng");
        JMenu messageMenu = new JMenu("Tin nhắn");
        billMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListRoomMouseClicked(evt);
            }

            private void viewListRoomMouseClicked(MouseEvent evt) {
                updateFrame.setVisible(false);
                var a = new ThanhToanFrame();
            }
        });
        
        roomMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListBillMouseClicked(evt);
            }

            private void viewListBillMouseClicked(MouseEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        messageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListMessageMouseClicked(evt);
            }

            private void viewListMessageMouseClicked(MouseEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        menuBar.add(homeMenu);
        menuBar.add(infoMenu);
        menuBar.add(roomMenu);
        menuBar.add(billMenu);
        menuBar.add(messageMenu);
        
        updateFrame.setJMenuBar(menuBar);

        JLabel lb1 = new JLabel("Thông tin cá nhân");
        lb1.setFont(font);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setBounds(250, 15, 300, 50);
        updateFrame.add(lb1);

        JPanel pn = new JPanel();
        pn.setBounds(20, 80, 750, 470);
        pn.setBackground(new Color(0, 202, 177));
        pn.setLayout(null);
        updateFrame.add(pn);

        font = new Font("Inter", Font.BOLD, 15);

        JLabel lb2 = new JLabel("Họ và tên:");
        lb2.setBounds(65, 50, 110, 40);
        lb2.setFont(font);
        pn.add(lb2);

        JTextField tf1 = new JTextField();
        tf1.setText(kh.getHo_ten());
        tf1.setBounds(200, 48, 400, 40);
        pn.add(tf1);

        JLabel lb3 = new JLabel("Ngày sinh:");
        lb3.setBounds(65, 100, 110, 40);
        lb3.setFont(font);
        pn.add(lb3);

        JTextField tf2 = new JTextField();
        tf2.setText(String.valueOf(kh.getNgay_sinh()));
        tf2.setBounds(200, 98, 400, 40);
        pn.add(tf2);

        JLabel lb4 = new JLabel("Số điện thoại:");
        lb4.setBounds(65, 150, 110, 40);
        lb4.setFont(font);
        pn.add(lb4);

        JTextField tf3 = new JTextField();
        tf3.setText(kh.getSdt());
        tf3.setBounds(200, 148, 400, 40);
        pn.add(tf3);

        JLabel lb5 = new JLabel("Số CCCD:");
        lb5.setBounds(65, 200, 110, 40);
        lb5.setFont(font);
        pn.add(lb5);

        JTextField tf4 = new JTextField();
        tf4.setText(kh.getCccd());
        tf4.setBounds(200, 198, 400, 40);
        pn.add(tf4);

        JLabel lb6 = new JLabel("Địa chỉ:");
        lb6.setBounds(65, 250, 110, 40);
        lb6.setFont(font);
        pn.add(lb6);

        JTextField tf5 = new JTextField();
        tf5.setText(kh.getDia_chi());
        tf5.setBounds(200, 248, 400, 40);
        pn.add(tf5);

        JLabel lb7 = new JLabel("Gmail:");
        lb7.setBounds(65, 300, 110, 40);
        lb7.setFont(font);
        pn.add(lb7);

        JTextField tf6 = new JTextField();
        tf6.setText(kh.getGmail());
        tf6.setBounds(200, 298, 400, 40);
        pn.add(tf6);

        JLabel lb8 = new JLabel("Tên tài khoản:");
        lb8.setBounds(65, 350, 110, 40);
        lb8.setFont(font);
        pn.add(lb8);

        JTextField tf7 = new JTextField();
        tf7.setText(kh.getTen_tai_khoan());
        tf7.setBounds(200, 348, 400, 40);
        pn.add(tf7);

        JButton bt = new JButton("Xác nhận");
        bt.setBounds(325, 410, 100, 50);
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
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void loginMouseClicked(MouseEvent evt) throws SQLException, ClassNotFoundException, ParseException {

                kh.setHo_ten(tf1.getText());
                String sdate = tf2.getText();
                Date date = new SimpleDateFormat("yyyy/MM/dd").parse(sdate);
                kh.setNgay_sinh(date);
                kh.setSdt(tf3.getText());
                kh.setCccd(tf4.getText());
                kh.setDia_chi(tf5.getText());
                kh.setGmail(tf6.getText());
                kh.setTen_tai_khoan(tf7.getText());

                int kt = kh.UpdateKhachHang(kh);
                if (kt != 0) {
                    JFrame frame = new JFrame("Thông báo");
                    JOptionPane.showMessageDialog(frame,
                            "Cập nhật thành công",
                            "Cập nhật",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JFrame frame = new JFrame("Thông báo");
                    JOptionPane.showMessageDialog(frame,
                            "Cập nhật thất bại",
                            "Cập nhật",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        updateFrame.setBounds(200, 100, 800, 650);
        updateFrame.setLayout(null);
        updateFrame.setResizable(false);
        updateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateFrame.setVisible(true);
    }
}
