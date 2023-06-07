package finalproject.app.admin;

import finalproject.Models.PhongTro;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import finalproject.Models.*;
import finalproject.Views.DSTinNhanAdminView;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anhvi
 */
class adminBillViewAllListMainContent extends JComponent{
    private String text;
    public adminBillViewAllListMainContent(String text) {
        this.text = text;
    }
    
    public void paint(Graphics g) {        
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
        int textWidth = fm.stringWidth(this.text);
        int textX = (800 - textWidth) / 2;
            
        // Draw the text
        graphics2.drawString(this.text, textX, 70);
        

    } 
}
public class adminBillViewListScreen {
    private JFrame frame;
    public adminBillViewListScreen() throws ClassNotFoundException, SQLException{
        frame = new JFrame("Phần mềm quản lý phòng trọ");
        adminBillViewAllListMainContent main_content =  new adminBillViewAllListMainContent("Danh sách hóa đơn");
        var a = new HoaDon();
        var kh = new KhachHang();
        ArrayList<HoaDon> temp = a.getAll();
        
         Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        int borderRadius = 10; // Adjust the value to control the border radius
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, BorderFactory.createEmptyBorder(0, borderRadius, 0, borderRadius));
        int i = 1;
        // stt
        JTextField sttTextField = new JTextField("STT");
        sttTextField.setHorizontalAlignment(SwingConstants.CENTER);
        sttTextField.setForeground(Color.BLACK); // Set the font color
        sttTextField.setBackground(Color.WHITE); // Set the background color

        sttTextField.setBounds(45, 105, 45, 40);
        // Create a rounded border
        sttTextField.setEditable(false);
        sttTextField.setBorder(compoundBorder);
        frame.add(sttTextField);
        // thang
        JTextField monthTextField = new JTextField("Tháng");
        monthTextField.setHorizontalAlignment(SwingConstants.CENTER);
        monthTextField.setForeground(Color.BLACK); // Set the font color
        monthTextField.setBackground(Color.WHITE); // Set the background color

        monthTextField.setBounds(90, 105, 120, 40);
        // Create a rounded border
        monthTextField.setEditable(false);
        monthTextField.setBorder(compoundBorder);
        frame.add(monthTextField);
        // họ tên khách hàng
        JTextField trangThaiTextField = new JTextField("Họ tên khách hàng");
        trangThaiTextField.setHorizontalAlignment(SwingConstants.CENTER);
        trangThaiTextField.setForeground(Color.BLACK); // Set the font color
        trangThaiTextField.setBackground(Color.WHITE); // Set the background color

        trangThaiTextField.setBounds(210, 105, 190, 40);
        // Create a rounded border
        trangThaiTextField.setEditable(false);
        trangThaiTextField.setBorder(compoundBorder);
        frame.add(trangThaiTextField);
        // tổng cộng
        JTextField totalTextField = new JTextField("Tộng cộng");
        totalTextField.setHorizontalAlignment(SwingConstants.CENTER);
        totalTextField.setForeground(Color.BLACK); // Set the font color
        totalTextField.setBackground(Color.WHITE); // Set the background color

        totalTextField.setBounds(400, 105, 85, 40);
        // Create a rounded border
        totalTextField.setEditable(false);
        totalTextField.setBorder(compoundBorder);
        frame.add(totalTextField);
        // trang thai
        JTextField statusTextField = new JTextField("Trạng thái");
        statusTextField.setHorizontalAlignment(SwingConstants.CENTER);
        statusTextField.setForeground(Color.BLACK); // Set the font color
        statusTextField.setBackground(Color.WHITE); // Set the background color

        statusTextField.setBounds(485,105, 150, 40);
        // Create a rounded border
        statusTextField.setEditable(false);
        statusTextField.setBorder(compoundBorder);
        frame.add(statusTextField);
        // 
        JTextField extendTextField = new JTextField();
        extendTextField.setHorizontalAlignment(SwingConstants.CENTER);
        extendTextField.setForeground(Color.BLACK); // Set the font color
        extendTextField.setBackground(Color.WHITE); // Set the background color

        extendTextField.setBounds(635,105, 100, 40);
        // Create a rounded border
        extendTextField.setEditable(false);
        extendTextField.setBorder(compoundBorder);
        frame.add(extendTextField);
        for(HoaDon hd : temp){
            int skip = i * 40;
            // stt
            sttTextField = new JTextField(String.valueOf(i));
            sttTextField.setHorizontalAlignment(SwingConstants.CENTER);
            sttTextField.setForeground(Color.BLACK); // Set the font color
            sttTextField.setBackground(Color.WHITE); // Set the background color

            sttTextField.setBounds(45, 105+skip, 45, 40);
            // Create a rounded border
            sttTextField.setEditable(false);
            sttTextField.setBorder(compoundBorder);
            frame.add(sttTextField);
            // thang
            monthTextField = new JTextField(hd.getNgay_tao().toString());
            monthTextField.setHorizontalAlignment(SwingConstants.CENTER);
            monthTextField.setForeground(Color.BLACK); // Set the font color
            monthTextField.setBackground(Color.WHITE); // Set the background color

            monthTextField.setBounds(90, 105+skip, 120, 40);
            // Create a rounded border
            monthTextField.setEditable(false);
            monthTextField.setBorder(compoundBorder);
            frame.add(monthTextField);
            // họ tên khách hàng
            String fullname = kh.getFullnameByRoomId(hd.getIdPT());
            trangThaiTextField = new JTextField(fullname);
            trangThaiTextField.setHorizontalAlignment(SwingConstants.CENTER);
            trangThaiTextField.setForeground(Color.BLACK); // Set the font color
            trangThaiTextField.setBackground(Color.WHITE); // Set the background color

            trangThaiTextField.setBounds(210, 105+skip, 190, 40);
            // Create a rounded border
            trangThaiTextField.setEditable(false);
            trangThaiTextField.setBorder(compoundBorder);
            frame.add(trangThaiTextField);
            // tổng cộng
            float total = hd.getTotalBill(hd.getId());
            totalTextField = new JTextField(String.valueOf(total));
            totalTextField.setHorizontalAlignment(SwingConstants.CENTER);
            totalTextField.setForeground(Color.BLACK); // Set the font color
            totalTextField.setBackground(Color.WHITE); // Set the background color

            totalTextField.setBounds(400, 105+skip, 85, 40);
            // Create a rounded border
            totalTextField.setEditable(false);
            totalTextField.setBorder(compoundBorder);
            frame.add(totalTextField);
            // trang thai
            statusTextField = new JTextField("Đã thanh toán");
            statusTextField.setHorizontalAlignment(SwingConstants.CENTER);
            statusTextField.setForeground(Color.BLACK); // Set the font color
            statusTextField.setBackground(Color.WHITE); // Set the background color

            statusTextField.setBounds(485,105+skip, 150, 40);
            // Create a rounded border
            statusTextField.setEditable(false);
            statusTextField.setBorder(compoundBorder);
            frame.add(statusTextField);
            
            // 
            JTextField extendTextField1 = new JTextField();
            extendTextField1.setHorizontalAlignment(SwingConstants.CENTER);
            extendTextField1.setForeground(Color.BLACK); // Set the font color
            extendTextField1.setBackground(Color.WHITE); // Set the background color

            extendTextField1.setBounds(635,105+skip, 100, 40);
            // Create a rounded border
            extendTextField1.setEditable(false);
            extendTextField1.setBorder(compoundBorder);
            frame.add(extendTextField1);
            i++;
        }
        
        JButton button3 = new JButton("Tạo mới");
        button3.setBackground(new Color(91, 253, 34));
        button3.setBounds(620,480, 100, 45);
        frame.add(button3);
        
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

        frame.setJMenuBar(menuBar);
        
        frame.add(main_content);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // make window visible
    }   
    private void viewListRoomMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            frame.setVisible(false);
            var a = new adminViewListRoomScreen();
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();     
        }
    }
    private void viewListBillMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            frame.setVisible(false);
            var a = new adminBillViewListScreen();
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();     
        }
    }
    private void viewListMessageMouseClicked(java.awt.event.MouseEvent evt) {
        frame.setVisible(false);
        var a = new DSTinNhanAdminView();
        a.setVisible(true);
    }
}
