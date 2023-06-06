/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.admin;

import javax.swing.JTextArea;
import finalproject.Models.*;
import java.sql.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;
/**
 *
 * @author anhvi
 */
class adminViewListRoomScreenMainComponent extends JComponent{
    private String text;

    public adminViewListRoomScreenMainComponent(String text) {
        this.text = text;
    }
    @Override
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
public class adminViewListRoomScreen {
    public adminViewListRoomScreen() throws ClassNotFoundException, SQLException{
        var frame = new JFrame();
        adminViewListRoomScreenMainComponent main_content =  new adminViewListRoomScreenMainComponent("Danh sách phòng");
        var a = new PhongTro();
        ArrayList<PhongTro> temp = a.getAll();
        
         Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        int borderRadius = 10; // Adjust the value to control the border radius
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, BorderFactory.createEmptyBorder(0, borderRadius, 0, borderRadius));
        int i = 1;
        // stt
        JTextField sttTextField = new JTextField("STT");
        sttTextField.setHorizontalAlignment(SwingConstants.CENTER);
        sttTextField.setForeground(Color.BLACK); // Set the font color
        sttTextField.setBackground(Color.WHITE); // Set the background color

        sttTextField.setBounds(45, 105, 100, 30);
        // Create a rounded border
        sttTextField.setEditable(false);
        sttTextField.setBorder(compoundBorder);
        frame.add(sttTextField);
        // so phong
        JTextField soPhongTextField = new JTextField("Số phòng");
        soPhongTextField.setHorizontalAlignment(SwingConstants.CENTER);
        soPhongTextField.setForeground(Color.BLACK); // Set the font color
        soPhongTextField.setBackground(Color.WHITE); // Set the background color

        soPhongTextField.setBounds(145, 105, 200, 30);
        // Create a rounded border
        soPhongTextField.setEditable(false);
        soPhongTextField.setBorder(compoundBorder);
        frame.add(soPhongTextField);
        // trang thai
        JTextField trangThaiTextField = new JTextField("Trạng thái");
        trangThaiTextField.setHorizontalAlignment(SwingConstants.CENTER);
        trangThaiTextField.setForeground(Color.BLACK); // Set the font color
        trangThaiTextField.setBackground(Color.WHITE); // Set the background color

        trangThaiTextField.setBounds(345, 105, 225, 30);
        // Create a rounded border
        trangThaiTextField.setEditable(false);
        trangThaiTextField.setBorder(compoundBorder);
        frame.add(trangThaiTextField);
        // 
        JTextField extendTextField = new JTextField();
        extendTextField.setHorizontalAlignment(SwingConstants.CENTER);
        extendTextField.setForeground(Color.BLACK); // Set the font color
        extendTextField.setBackground(Color.WHITE); // Set the background color

        extendTextField.setBounds(570,105, 150, 30);
        // Create a rounded border
        extendTextField.setEditable(false);
        extendTextField.setBorder(compoundBorder);
        frame.add(extendTextField);
        for(PhongTro pt : temp){
            int skip = i * 30;
            // stt
            sttTextField = new JTextField(String.valueOf(i));
            sttTextField.setHorizontalAlignment(SwingConstants.CENTER);
            sttTextField.setForeground(Color.BLACK); // Set the font color
            sttTextField.setBackground(Color.WHITE); // Set the background color

            sttTextField.setBounds(45, 105+skip, 100, 30);
            // Create a rounded border
            sttTextField.setEditable(false);
            sttTextField.setBorder(compoundBorder);
            frame.add(sttTextField);
            // so phong
            soPhongTextField = new JTextField(String.valueOf(pt.getSo_phong()));
            soPhongTextField.setHorizontalAlignment(SwingConstants.CENTER);
            soPhongTextField.setForeground(Color.BLACK); // Set the font color
            soPhongTextField.setBackground(Color.WHITE); // Set the background color

            soPhongTextField.setBounds(145, 105+skip, 200, 30);
            // Create a rounded border
            soPhongTextField.setEditable(false);
            soPhongTextField.setBorder(compoundBorder);
            frame.add(soPhongTextField);
            // trang thai
            trangThaiTextField = new JTextField(pt.getTinh_trang_su_dung());
            trangThaiTextField.setHorizontalAlignment(SwingConstants.CENTER);
            trangThaiTextField.setForeground(Color.BLACK); // Set the font color
            trangThaiTextField.setBackground(Color.WHITE); // Set the background color

            trangThaiTextField.setBounds(345, 105+skip, 225, 30);
            // Create a rounded border
            trangThaiTextField.setEditable(false);
            trangThaiTextField.setBorder(compoundBorder);
            frame.add(trangThaiTextField);
            // 
            extendTextField = new JTextField();
            extendTextField.setHorizontalAlignment(SwingConstants.CENTER);
            extendTextField.setForeground(Color.BLACK); // Set the font color
            extendTextField.setBackground(Color.WHITE); // Set the background color

            extendTextField.setBounds(570,105+skip, 150, 30);
            // Create a rounded border
            extendTextField.setEditable(false);
            extendTextField.setBorder(compoundBorder);
            frame.add(extendTextField);
            i++;
        }
        JButton button1 = new JButton("Xóa");
        button1.setBackground(new Color(245, 66, 66));
        button1.setBounds(620,480, 100, 45);
        frame.add(button1);
        
        JButton button2 = new JButton("Thêm");
        button2.setBackground(new Color(255,155,73));
        button2.setBounds(500,480, 100, 45);
        button2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e)  { 
                var a = new adminRoomAddingScreen();
                frame.setVisible(false);
            } 
        } );
        frame.add(button2);
        
        JButton button3 = new JButton("Tìm kiếm");
        button3.setBackground(new Color(91, 253, 34));
        button3.setBounds(380,480, 100, 45);
        frame.add(button3);
        
        frame.add(main_content);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // make window visible
    }
}
