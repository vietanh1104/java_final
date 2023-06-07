package finalproject.app;

import java.awt.*;
import javax.swing.*;  

/**
 *
 * @author anhvi
 */
public class Main_component extends JComponent{
    private String text;
    public Main_component(String text){
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
        int textHeight = fm.getHeight();
        int textX = (800 - textWidth) / 2;

        // Draw the text
        graphics2.drawString(this.text, textX, 70);

    } 
}