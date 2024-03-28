package Hotel.Management.System;

import javax.swing.*;

public class splash extends JFrame {
    splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash2.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,800,600);
        add(label);
        setLayout(null);
        setSize(800,600);
        setVisible(true);
        setLocation(400,80);
        try {
            Thread.sleep(7000);
            new login();
            setVisible(false);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new splash();

    }
}