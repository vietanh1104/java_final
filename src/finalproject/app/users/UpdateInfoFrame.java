package finalproject.app.users;

import java.awt.*;
import javax.swing.*;

public class UpdateInfoFrame {

    public UpdateInfoFrame() {
        JFrame updateFrame = new JFrame("Phòng trọ nhóm 5");
        Font font = new Font("Inter", Font.PLAIN, 28);

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
        tf1.setBounds(200, 48, 400, 40);
        pn.add(tf1);

        JLabel lb3 = new JLabel("Ngày sinh:");
        lb3.setBounds(65, 100, 110, 40);
        lb3.setFont(font);
        pn.add(lb3);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 98, 400, 40);
        pn.add(tf2);
        
        JLabel lb4 = new JLabel("Số điện thoại:");
        lb4.setBounds(65, 150, 110, 40);
        lb4.setFont(font);
        pn.add(lb4);

        JTextField tf3 = new JTextField();
        tf3.setBounds(200, 148, 400, 40);
        pn.add(tf3);
        
        JLabel lb5 = new JLabel("Số CCCD:");
        lb5.setBounds(65, 200, 110, 40);
        lb5.setFont(font);
        pn.add(lb5);

        JTextField tf4 = new JTextField();
        tf4.setBounds(200, 198, 400, 40);
        pn.add(tf4);
        
        JLabel lb6 = new JLabel("Địa chỉ:");
        lb6.setBounds(65, 250, 110, 40);
        lb6.setFont(font);
        pn.add(lb6);

        JTextField tf5 = new JTextField();
        tf5.setBounds(200, 248, 400, 40);
        pn.add(tf5);
        
        JLabel lb7 = new JLabel("Gmail:");
        lb7.setBounds(65, 300, 110, 40);
        lb7.setFont(font);
        pn.add(lb7);

        JTextField tf6 = new JTextField();
        tf6.setBounds(200, 298, 400, 40);
        pn.add(tf6);
        
        JLabel lb8 = new JLabel("Tên tài khoản:");
        lb8.setBounds(65, 350, 110, 40);
        lb8.setFont(font);
        pn.add(lb8);

        JTextField tf7 = new JTextField();
        tf7.setBounds(200, 348, 400, 40);
        pn.add(tf7);
        
        JButton bt = new JButton("Xác nhận");
        bt.setBounds(325, 410, 100, 50);
        bt.setBackground(new Color(255, 155, 73));
        bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pn.add(bt);
        
        updateFrame.setBounds(200, 100, 800, 600);
        updateFrame.setLayout(null);
        updateFrame.setResizable(false);
        updateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateFrame.setVisible(true);
    }
}
