/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Components;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author anhvi
 */
public class RectangleComponent extends JComponent {
    private Color backgroundColor;
    private int cornerRadius;
    private String textLabel;
    private String textField;
    private boolean displayTextField;
    private int x,y,w,h;

    public RectangleComponent(Color backgroundColor, int cornerRadius, String textLabel, String textField, int x, int y, int w, int h) {
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.textLabel = textLabel;
        this.textField = textField;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    

    public void setDisplayTextField(boolean displayTextField) {
        this.displayTextField = displayTextField;
        repaint(); // Trigger repainting of the component
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        // Set the background color
        g2d.setColor(backgroundColor);

        // Draw the rounded rectangle with border radius
        g2d.fillRoundRect(x, y, width, height, cornerRadius, cornerRadius);

        if (displayTextField) {
            JTextField textField = new JTextField(this.textField);
            textField.setHorizontalAlignment(SwingConstants.CENTER);

            textField.setBounds(x, y, w, h);

            add(textField); // Add the text field to the component
        }
    }
}
