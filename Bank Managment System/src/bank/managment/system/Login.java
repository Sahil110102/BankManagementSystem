
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField ;
    Login(){
        
        setTitle("LEO'S AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg")); //Icon 
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel label = new JLabel (i3); //make an object to display
        label.setBounds(70, 10, 100, 100);  //

        add(label); //place the image object in the add functions
        JLabel text = new JLabel ("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(230,40,500,40);
        add(text);
        
        //Display CARDNO Text 
        JLabel cardno = new JLabel ("CARD NO :");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        //Text Field for CARD NO 
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14 ));
        add(cardTextField);
        
        //Display PIN Text
        JLabel pin = new JLabel ("PIN :");
        pin.setFont(new Font("raleway", Font.BOLD, 28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        //Text Field for PIN
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220,220,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 16 ));
        add(pinTextField);
        
        //Login Button
        login = new JButton ("SIGN IN ");
        login.setBounds(300, 300, 90, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        //Clear Button
        clear = new JButton ("CLEAR ");
        clear.setBounds(430, 300, 90, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        //Signup Button
        signup = new JButton ("SIGN UP ");
        signup.setBounds(300, 350, 220, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
                
        
        getContentPane().setBackground(Color.white);
        
        setSize(700,480); //sets the size of the box
        setVisible(true); // Makes the box visible
        setLocation (400,200); //box in the centre
        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '" + cardnumber + "' and pinnumber = '" + pinnumber + "'";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Login();
        
    }
}