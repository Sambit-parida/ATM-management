package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener
{
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposite(String pin)
    {
        this.pin = pin;

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,880);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(27, 130, 155));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,365,150,35);
        b1.setBackground(new Color(27, 130, 155));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,409,150,35);
        b2.setBackground(new Color(27, 130, 155));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount you want to Deposit");
                }else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs, "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Deposite("");
    }
}
