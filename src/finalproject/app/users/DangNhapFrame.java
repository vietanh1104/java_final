package finalproject.app.users;

import java.awt.*;
import javax.swing.*; 
import javax.swing.border.*;


class DangNhapComponent extends JComponent{
    private String text;
    public DangNhapComponent(String text){
        this.text = text;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D graphics2 = (Graphics2D) g;
        graphics2.setColor(new Color(0,202,177));
        graphics2.fillRoundRect(17, 100, 750, 445, 10, 10);
        
        graphics2.setColor(new Color(0,4,2));
        graphics2.setStroke(new BasicStroke(1));
        
        graphics2.drawRoundRect(17, 100, 750, 445, 10, 10);
        
        
        // Set the font and color for the text
        Font font = new Font("Arial", Font.PLAIN, 48);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
        
        // Calculate the position to center the text
        FontMetrics fm = graphics2.getFontMetrics(font);
        int textWidth = fm.stringWidth(text);
        int textX = (800 - textWidth) / 2;
            
        // Draw the text
        graphics2.drawString(text, textX, 70);
        //label Tai khoan
        String label = "Tài Khoản";
        font = new Font("Arial", Font.PLAIN, 30);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
            
        // Draw the text
        graphics2.drawString(label, 250, 170);
        
        JTextField accountIp = new JTextField();
        accountIp.setHorizontalAlignment(SwingConstants.LEFT);
        accountIp.setBounds(250, 200, 300, 46);
        // Create a rounded border
        Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        int borderRadius = 10; // Adjust the value to control the border radius
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, BorderFactory.createEmptyBorder(0, borderRadius, 0, borderRadius));
        accountIp.setBorder(compoundBorder);
        add(accountIp);
        //label Tai khoan
        String label1 = "Mật Khẩu";
            
        // Draw the text
        graphics2.drawString(label1, 250, 300);
        
        JPasswordField passwordIp = new JPasswordField();
        passwordIp.setEchoChar('*');
        passwordIp.setHorizontalAlignment(SwingConstants.LEFT);
        passwordIp.setBounds(250, 330, 300, 46);
        // Create a rounded border
        passwordIp.setBorder(compoundBorder);
        add(passwordIp);
        JButton loginBt = new JButton("Đăng nhập");
        loginBt.setBounds(350, 400, 100, 50);
        add(loginBt);
    }
}

public class DangNhapFrame {
    public DangNhapFrame(){
        JFrame dangNhapFrame = new JFrame("Phần mềm quản lí phòng trọ");       
        var main_component = new DangNhapComponent("Đăng Nhập");
        dangNhapFrame.add(main_component);
        dangNhapFrame.setBounds(200, 100, 800, 600);
        dangNhapFrame.setResizable(false);
        dangNhapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangNhapFrame.setVisible(true);
    }
    
}
