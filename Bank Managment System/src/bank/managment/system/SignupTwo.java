
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;
    
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM- 2");
        
        //Additional Details
        JLabel additionalDetails = new JLabel("Page 2: Additional Details:" );
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(275,80,400,40);
        add(additionalDetails);
        
        //Religion
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"HINDU", "MUSLIM", "CHRISTIAN", "OTHER"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
      
        //Category
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[] = {"GENERAL", "OBC", "SC", "ST", "OTHER"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
    
        //Income
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valIncome[] = {"NULL","< 1,50,000","<2,50,0000","<5,00,000","UPTO 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        //Educational Details
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        String valEducation[] = {"NON-GRADUATION","GRADUATE","POST-GRADUATION","DOCTRATE","OTHERS"};
        education = new JComboBox(valEducation);
        education.setBounds(300, 315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        //Email Address
        JLabel email = new JLabel("Qualifications:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,315,200,30);
        add(email);

        //Marital Status
        JLabel mstate = new JLabel("Occupation:");
        mstate.setFont(new Font("Raleway",Font.BOLD, 20));
        mstate.setBounds(100,390,200,30);
        add(mstate);
        
        String valOccupation[] = {"SALARIED","SELF-EMPLOYED","BUISNESS-","STUDENT","RETIRED","OTHERS"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        //Pan Number
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setBounds(300, 440,400,30);
        pan.setFont(new Font("Arial", Font.BOLD, 14 ));
        add(pan);
        
        //City
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setBounds(300, 490,400,30);
        aadhar.setFont(new Font("Arial", Font.BOLD, 14 ));
        add(aadhar);
        
        //State
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup mgroup = new ButtonGroup();
        mgroup.add(syes);
        mgroup.add(sno);
        
        //Existing Account
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
         
        next = new JButton ("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800 );
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
       
        String sreligion = (String)religion.getSelectedItem(); //Retrive value from the input
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
                
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "YES";
        }
        else if (sno.isSelected()){
            seniorcitizen = "NO";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "YES";
        }
        else if (eno.isSelected()){
            existingaccount = "NO";
        }
                
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
                
            Conn c = new Conn();
            String query = "Insert Into Signuptwo Values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+existingaccount+"', '"+seniorcitizen+"')";
            c.s.executeUpdate(query);
            
            //SignupThree Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);     
        }
        catch (Exception e){
            System.out.println(e);
        }  
    }
    

 
    public static void main(String args[]) {
        new SignupTwo("");
        
    }
}
