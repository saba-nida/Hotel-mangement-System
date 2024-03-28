package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    JComboBox comboBox;
    JTextField textFieldno,textFieldName,textFieldcountry,textFieldde;

    JRadioButton r1,r2;

    Choice c1;

    JLabel date;

    JButton add,back;
    NewCustomer(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelname = new JLabel("NEW CUSTOMER FORM");
        labelname.setBounds(118,11,260,53);
        labelname.setFont(new Font("Tahoma",Font.BOLD,20));
        labelname.setForeground(Color.white);
        panel.add(labelname);

        JLabel labelid = new JLabel("ID");
        labelid.setBounds(35,76,200,14);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelid.setForeground(Color.white);
        panel.add(labelid);

        comboBox = new JComboBox(new String[]{"Passport","Aadhar Card","Voter Id","Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setForeground(Color.white);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(comboBox);

        JLabel labelno = new JLabel("NUMBER");
        labelno.setBounds(35,111,200,14);
        labelno.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelno.setForeground(Color.white);
        panel.add(labelno);

        textFieldno = new JTextField();
        textFieldno.setBounds(271,111,150,20);
        panel.add(textFieldno);

        JLabel labelName = new JLabel("NAME");
        labelName.setBounds(35,151,200,14);
        labelName.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelName.setForeground(Color.white);
        panel.add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(271,151,150,20);
        panel.add(textFieldName);

        JLabel labelgen = new JLabel("GENDER");
        labelgen.setBounds(35,191,200,14);
        labelgen.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelgen.setForeground(Color.white);
        panel.add(labelgen);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahome",Font.BOLD,14));
        r1.setBackground(new Color(3,45,48));
        r1.setForeground(Color.white);
        r1.setBounds(271,191,80,13);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahome",Font.BOLD,14));
        r2.setBackground(new Color(3,45,48));
        r2.setForeground(Color.white);
        r2.setBounds(350,191,80,13);
        panel.add(r2);

        JLabel labelcountry = new JLabel("COUNTRY");
        labelcountry.setBounds(35,231,200,14);
        labelcountry.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcountry.setForeground(Color.white);
        panel.add(labelcountry);

        textFieldcountry = new JTextField();
        textFieldcountry.setBounds(271,231,150,20);
        panel.add(textFieldcountry);


        JLabel labelroom = new JLabel("ALLOCATED ROOM NUMBER");
        labelroom.setBounds(35,274,200,14);
        labelroom.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelroom.setForeground(Color.white);
        panel.add(labelroom);


        c1 = new Choice();
        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.white);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel labelcis = new JLabel("CHECKED-IN");
        labelcis.setBounds(35,316,200,14);
        labelcis.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcis.setForeground(Color.white);
        panel.add(labelcis);

        java.util.Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setFont(new Font("Tahoma",Font.PLAIN,14));
        date.setForeground(Color.white);
        panel.add(date);

        JLabel labeldeposit = new JLabel("DEPOSIT");
        labeldeposit.setBounds(35,359,200,14);
        labeldeposit.setFont(new Font("Tahoma",Font.PLAIN,14));
        labeldeposit.setForeground(Color.white);
        panel.add(labeldeposit);

        textFieldde = new JTextField();
        textFieldde.setBounds(271,359,150,20);
        panel.add(textFieldde);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setSize(850,550);
        setLayout(null);
        setLocation(500,150);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== add){
            con c = new con();
            String radio = null;
            if(r1.isSelected()){
                radio= "Male";
            }else if (r2.isSelected()){
                radio= "Female";
            }
            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldno.getText();
            String s3 = textFieldName.getText();
            String s4 = radio;
            String s5 = textFieldcountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldde.getText();

            try {
                String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber="+s6;
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Added Successfully");
                setVisible(false);

            }catch (Exception e1){
                e1.printStackTrace();
            }

        }else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
