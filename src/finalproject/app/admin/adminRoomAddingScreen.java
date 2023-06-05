/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.admin;
import java.awt.*;
import javax.swing.*;  
import javax.swing.border.*;  
import java.awt.image.BufferedImage;
import java.awt.event.*;
/**
 *
 * @author anhvi
 */
class adminRoomAddingMainContent extends JComponent{
    private String text;
    private String roomId;
    private String address;
    private String status;
    private String infrastructure;
    private String image;

    public String getRoomId() {
        return roomId;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public adminRoomAddingMainContent(String text) {
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
        
        // label Số phòng
        // Set the font and color for the text
        text = "Số phòng:";
        font = new Font("Arial", Font.PLAIN, 15);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
            
        // Draw the text
        graphics2.drawString(this.text, 80, 170);
        
        
        
        // label Địa chỉ
        // Set the font and color for the text
        text = "Địa chỉ:";
        font = new Font("Arial", Font.PLAIN, 15);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
            
        // Draw the text
        graphics2.drawString(this.text, 80, 220);
        
        // label Trạng thái
        // Set the font and color for the text
        text = "Trạng thái:";
        font = new Font("Arial", Font.PLAIN, 15);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
            
        // Draw the text
        graphics2.drawString(this.text, 80, 270);
        
        // label Cơ sở vật chất
        // Set the font and color for the text
        text = "Cơ sở vật chất:";
        font = new Font("Arial", Font.PLAIN, 15);
        graphics2.setFont(font);
        graphics2.setColor(Color.BLACK);
            
        // Draw the text
        graphics2.drawString(this.text, 80, 320);  
    }
    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
            BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = resizedImage.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
            g2d.dispose();
            return resizedImage;
    }
}

public class adminRoomAddingScreen {
    public adminRoomAddingScreen(){
        var frame = new JFrame("Phần mềm quản lý phòng trọ");
        String windowContent = "Thêm mới phòng";
        adminRoomAddingMainContent main_component = new adminRoomAddingMainContent(windowContent) ;
        
        // roomId
        JTextField roomIdTextField = new JTextField(" ");
        roomIdTextField.setHorizontalAlignment(SwingConstants.LEFT);
        roomIdTextField.setForeground(Color.BLACK); // Set the font color
        roomIdTextField.setBackground(Color.WHITE); // Set the background color

        roomIdTextField.setBounds(220, 138, 300, 46);
        // Create a rounded border
        Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        int borderRadius = 10; // Adjust the value to control the border radius
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, BorderFactory.createEmptyBorder(0, borderRadius, 0, borderRadius));
        roomIdTextField.setBorder(compoundBorder);
        frame.add(roomIdTextField);
        
        
        // address   
        JTextField addressTextField = new JTextField(" ");
        addressTextField.setHorizontalAlignment(SwingConstants.LEFT);
        addressTextField.setForeground(Color.BLACK); // Set the font color
        addressTextField.setBackground(Color.WHITE); // Set the background color

        addressTextField.setBounds(220, 188, 300, 46);
        // Create a rounded border
        addressTextField.setBorder(compoundBorder);
        frame.add(addressTextField);
        
        // status
        JTextField statusTextField = new JTextField(" ");
        statusTextField.setHorizontalAlignment(SwingConstants.LEFT);
        statusTextField.setForeground(Color.BLACK); // Set the font color
        statusTextField.setBackground(Color.WHITE); // Set the background color

        statusTextField.setBounds(220, 238, 300, 46);
        // Create a rounded border
        statusTextField.setBorder(compoundBorder);
        frame.add(statusTextField);
        
        
        // infrastructure
        JTextField infrastructureTextField = new JTextField(" ");
        infrastructureTextField.setHorizontalAlignment(SwingConstants.LEFT);
        infrastructureTextField.setForeground(Color.BLACK); // Set the font color
        infrastructureTextField.setBackground(Color.WHITE); // Set the background color

        infrastructureTextField.setBounds(220, 288, 300, 46);
        // Create a rounded border
        infrastructureTextField.setBorder(compoundBorder);
        frame.add(infrastructureTextField);
        
        JButton button = new JButton("Thêm mới");
        button.setBackground(new Color(91, 253, 34));
        button.setBounds(620,480, 100, 45);
        
        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                String roomId = roomIdTextField.getText();
                String address = addressTextField.getText();
                String status = statusTextField.getText();
                String infrastructure = infrastructureTextField.getText();
                System.out.print(roomId + address + status + infrastructure);
            } 
        } );
        frame.add(button);
        frame.add(main_component);
              
        
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // make window visible
    }  
}
