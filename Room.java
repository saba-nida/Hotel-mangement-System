package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            con c = new con();
            String roominfo = "select * from room";
            ResultSet resultSet= c.statement.executeQuery(roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception E){
            E.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(200,500,120,30);
        panel.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel room= new JLabel("Room No.");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);

        JLabel availability = new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availability);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(216,15,150,19);
        clean.setForeground(Color.white);
        clean.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(330,15,150,19);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel type = new JLabel("Bed Type");
        type.setBounds(417,15,80,19);
        type.setForeground(Color.white);
        type.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(type);



        setUndecorated(true);
        setLayout(null);
        setVisible(true);
        setLocation(500,100);
        setSize(900,600);

    }

    public static void main(String[] args) {
        new Room();
    }
}
