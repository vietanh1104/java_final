package finalproject.app.users;

import javax.swing.*;
import finalproject.app.Main_component;

public class UpdateInfoFrame {
    public UpdateInfoFrame(){
        JFrame updateFrame = new JFrame("Phòng trọ nhóm 5");
        var main_component = new Main_component("Sửa thông tin cá nhân");
        updateFrame.add(main_component);
        updateFrame.setBounds(200, 100, 800, 600);
        updateFrame.setResizable(false);
        updateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateFrame.setVisible(true);
    }
}
