/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.app.users;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;  
import javax.swing.border.*;  
/**
 *
 * @author anhvi
 */
class userRoomDetailMainContent extends JComponent{
    private String text;
    private String roomId;
    private String address;
    private String status;
    private String infrastructure;
    private String image;

    public userRoomDetailMainContent(String text, String roomId, String address, String status, String infrastructure,
            String image) {
        this.text = text;
        this.roomId = roomId;
        this.address = address;
        this.status = status;
        this.infrastructure = infrastructure;
        this.image = image;
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
        
        // roomId
        JTextField roomIdTextField = new JTextField(this.roomId);
        roomIdTextField.setHorizontalAlignment(SwingConstants.LEFT);
        roomIdTextField.setEditable(false);
        roomIdTextField.setForeground(Color.BLACK); // Set the font color
        roomIdTextField.setBackground(Color.WHITE); // Set the background color

        roomIdTextField.setBounds(220, 138, 300, 46);
        // Create a rounded border
        Border roundedBorder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        int borderRadius = 10; // Adjust the value to control the border radius
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, BorderFactory.createEmptyBorder(0, borderRadius, 0, borderRadius));
        roomIdTextField.setBorder(compoundBorder);
        add(roomIdTextField);
        
        // address   
        JTextField addressTextField = new JTextField(this.address);
        addressTextField.setHorizontalAlignment(SwingConstants.LEFT);
        addressTextField.setEditable(false);
        addressTextField.setForeground(Color.BLACK); // Set the font color
        addressTextField.setBackground(Color.WHITE); // Set the background color

        addressTextField.setBounds(220, 188, 300, 46);
        // Create a rounded border
        addressTextField.setBorder(compoundBorder);
        add(addressTextField);
        
        // status
        JTextField statusTextField = new JTextField(this.status);
        statusTextField.setHorizontalAlignment(SwingConstants.LEFT);
        statusTextField.setEditable(false);
        statusTextField.setForeground(Color.BLACK); // Set the font color
        statusTextField.setBackground(Color.WHITE); // Set the background color

        statusTextField.setBounds(220, 238, 300, 46);
        // Create a rounded border
        statusTextField.setBorder(compoundBorder);
        add(statusTextField);
        
        // infrastructure
        JTextField infrastructureTextField = new JTextField(this.infrastructure);
        infrastructureTextField.setHorizontalAlignment(SwingConstants.LEFT);
        infrastructureTextField.setEditable(false);
        infrastructureTextField.setForeground(Color.BLACK); // Set the font color
        infrastructureTextField.setBackground(Color.WHITE); // Set the background color

        infrastructureTextField.setBounds(220, 288, 300, 46);
        // Create a rounded border
        infrastructureTextField.setBorder(compoundBorder);
        add(infrastructureTextField);
        
        
        // image
        String filepath = "C:\\Users\\anhvi\\Desktop\\java\\java_final\\src\\finalproject\\app\\staticFiles\\" + image;
        BufferedImage image = null;
        try{
            BufferedImage originalImage = ImageIO.read(new File(filepath)); // Replace with the path to your image file
            image = resizeImage(originalImage, 180, 180);
        }catch(IOException e){
            e.printStackTrace();
        }
        if(image != null){
                g.drawImage(image, 560, 140, null);
        }
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
public class userRoomDetailScreen {
    private final String roomId;
    private final String address;
    private final String status;
    private final String infrastructure;
    private final String image;
    public userRoomDetailScreen(String roomId, String address, String status, String infrastructure, String image){
        this.roomId = roomId;
        this.address = address;
        this.status = status;
        this.infrastructure = infrastructure;
        this.image = image;
        var frame = new JFrame("Phần mềm quản lý phòng trọ");
        String windowContent = "Thông tin phòng";
        userRoomDetailMainContent main_component = new userRoomDetailMainContent(windowContent,this.roomId,
                this.address,this.status,this.infrastructure, this.image) ;
        frame.add(main_component);
         
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // make window visible
    }
}
