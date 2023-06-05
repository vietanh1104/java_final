package finalproject.app.users;

import javax.swing.*; 
import finalproject.app.Main_component;


public class DangNhapFrame {
    public DangNhapFrame(){
        JFrame dangNhapFrame = new JFrame("Phần mềm quản lí phòng trọ");       
        JLabel loginLb = new JLabel("Tài khoản");
        loginLb.setBounds(0, 0, 200, 50);
        JTextField accountIp = new JTextField();
        accountIp.setBounds(250, 200, 300, 40);
        JPasswordField passwordIp = new JPasswordField();
        passwordIp.setBounds(250, 400, 300, 40);
        passwordIp.setEchoChar('*');
        var main_component = new Main_component("Đăng Nhập");
        dangNhapFrame.add(main_component);
        main_component.add(loginLb);
        main_component.add(accountIp);
        main_component.add(passwordIp);
        dangNhapFrame.setBounds(200, 100, 800, 600);
        dangNhapFrame.setResizable(false);
        dangNhapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangNhapFrame.setVisible(true);
    }
    
}
