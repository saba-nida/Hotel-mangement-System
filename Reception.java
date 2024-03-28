package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    JButton back;


    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/recp.gif"));
        Image i2 = i11.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(450,150,400,400);
        panel.add(label1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image i22 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i22);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(5,530,250,250);
        panel1.add(label);

        JButton btnNCF = new JButton("NEW CUSTOMER FORM");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new NewCustomer();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnroom = new JButton("ROOM");
        btnroom.setBounds(30,70,200,30);
        btnroom.setBackground(Color.black);
        btnroom.setForeground(Color.white);
        panel1.add(btnroom);
        btnroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(80,780,95,30);
        panel1.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard();
                setVisible(false);
            }
        });

        JButton btndept = new JButton("DEPARTMENT");
        btndept.setBounds(30,110,200,30);
        btndept.setBackground(Color.black);
        btndept.setForeground(Color.white);
        panel1.add(btndept);
        btndept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btna = new JButton("ALL EMPLOYEE INFO");
        btna.setBounds(30,150,200,30);
        btna.setBackground(Color.black);
        btna.setForeground(Color.white);
        panel1.add(btna);
        btna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Employee();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton btnci = new JButton("CUSTOMER INFO");
        btnci.setBounds(30,190,200,30);
        btnci.setBackground(Color.black);
        btnci.setForeground(Color.white);
        panel1.add(btnci);
        btnci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CustomerInfo();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnmi = new JButton("MANAGER INFO");
        btnmi.setBounds(30,230,200,30);
        btnmi.setBackground(Color.black);
        btnmi.setForeground(Color.white);
        panel1.add(btnmi);
        btnmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ManagerInfo();


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnco = new JButton("CHECK OUT");
        btnco.setBounds(30,270,200,30);
        btnco.setBackground(Color.black);
        btnco.setForeground(Color.white);
        panel1.add(btnco);
        btnco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnup = new JButton("UPDATE CHECK-IN DETAILS");
        btnup.setBounds(30,310,200,30);
        btnup.setBackground(Color.black);
        btnup.setForeground(Color.white);
        panel1.add(btnup);
        btnup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateCheck();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnrs = new JButton("UPDATE ROOM STATUS");
        btnrs.setBounds(30,350,200,30);
        btnrs.setBackground(Color.black);
        btnrs.setForeground(Color.white);
        panel1.add(btnrs);
        btnrs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateRoom();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnpi = new JButton("PICK UP SERVICES");
        btnpi.setBounds(30,390,200,30);
        btnpi.setBackground(Color.black);
        btnpi.setForeground(Color.white);
        panel1.add(btnpi);
        btnpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new PickUp();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnsr = new JButton("SEARCH ROOM");
        btnsr.setBounds(30,430,200,30);
        btnsr.setBackground(Color.black);
        btnsr.setForeground(Color.white);
        panel1.add(btnsr);
        btnsr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Reception();
    }
}
