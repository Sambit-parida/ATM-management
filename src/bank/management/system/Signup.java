
package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener
{
     JRadioButton r1,r2,r3,m1,m2;
     JButton next;
     JTextField textName, textFname, textEmail,textAdd,textCity,textPin,textState;

     JDateChooser dateChooser;

    Random ran =new Random();
    long first4  = (ran.nextLong() % 9000L)+1000L;
    String first = " "+Math.abs(first4);
    Signup()
    {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel lable1 = new JLabel("APPLICATION FORM NO."+first);
        lable1.setBounds(160,20,600,40);
        lable1.setFont(new Font("Raleway",Font.BOLD,38));
        add(lable1);

        JLabel lable2 = new JLabel("Page 1");
        lable2.setFont(new Font("Raleway",Font.BOLD,22));
        lable2.setBounds(330,70,600,30);
        add(lable2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel  labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,350,30);
        add(textName);


        JLabel  labelfName = new JLabel("Father Name:");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,350,30);
        add(textFname);

        JLabel  DOB = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(155, 238, 232));
        dateChooser.setBounds(300,290,350,30);
        add(dateChooser);

        JLabel lableG = new JLabel("Gender");
        lableG.setFont(new Font("Raleway",Font.BOLD,20));
        lableG.setBounds(100,340,200,30);
        add(lableG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(155, 238, 232));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(155, 238, 232));
        r2.setBounds(430,340,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(155, 238, 232));
        r3.setBounds(560,340,90,30);
        add(r3);

        ButtonGroup btngrp= new ButtonGroup();
        btngrp.add(r1);
        btngrp.add(r2);
        btngrp.add(r3);

        JLabel lableEmail = new JLabel("Email address:");
        lableEmail.setFont(new Font("Raleway",Font.BOLD,20));
        lableEmail.setBounds(100,390,200,30);
        add(lableEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,350,30);
        add(textEmail);

        JLabel lableMs = new JLabel("Marital Status :");
        lableMs.setFont(new Font("Raleway",Font.BOLD,20));
        lableMs.setBounds(100,440,200,30);
        add(lableMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(155, 238, 232));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(430,440,100,30);
        m2.setBackground(new Color(155, 238, 232));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        ButtonGroup btngrp1 = new ButtonGroup();
        btngrp1.add(m1);
        btngrp1.add(m2);

        JLabel lableAdd = new JLabel("Address :");
        lableAdd.setFont(new Font("Raleway",Font.BOLD,20));
        lableAdd.setBounds(100,490,200,30);
        add(lableAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,350,30);
        add(textAdd);

        JLabel lableCity = new JLabel("City:");
        lableCity.setFont(new Font("Raleway",Font.BOLD,20));
        lableCity.setBounds(100,540,200,30);
        add(lableCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,350,30);
        add(textCity);

        JLabel lablePin = new JLabel("Pin Code:");
        lablePin.setFont(new Font("Raleway",Font.BOLD,20));
        lablePin.setBounds(100,590,200,30);
        add(lablePin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,350,30);
        add(textPin);

        JLabel lableState = new JLabel("State:");
        lableState.setFont(new Font("Raleway",Font.BOLD,20));
        lableState.setBounds(100,640,200,30);
        add(lableState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,350,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setBounds(570,700,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(155, 238, 232));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender  = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "Married";
        }
        else if (m2.isSelected()) {
            marital = "Unmarried";
        }

        String address  = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"' , '"+dob+"', '"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"', '"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Signup();
    }
}
