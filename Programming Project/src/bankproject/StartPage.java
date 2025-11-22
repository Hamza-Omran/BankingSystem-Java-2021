package bankproject;

import static bankproject.Createaccountwindow.IDofclient;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartPage extends JFrame implements ActionListener{
    //w is for ID and index of client in the arraylist
    public static int w;
    //declare buttons and text fields
    JButton register,create_Account;
    JTextField id,password; 
    
    StartPage() {
        //declare labels
        JLabel pass,idd,title;
        //asigning labels
        idd=new JLabel("Enter ID :");
        pass=new JLabel("Enter Password :");
        title=new JLabel("Bank Misr");
        
        //set properties for labels
        idd.setBounds(400,200,400,80);
        idd.setFont((new Font(null,Font.BOLD,20)));
        
        pass.setBounds(330,300,400,80);
        pass.setFont((new Font(null,Font.BOLD,20)));
        
        title.setBounds(350,20,700,120);
        title.setFont((new Font(null,Font.BOLD,120)));
        //dclare panels
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        //set properties for panels
        p1.setBounds(0,0,1400,170);
        p1.setBackground(new Color(255, 215, 0));
        
        p2.setBounds(0,170,1400,530);
        p2.setBackground(new Color(163, 0, 0));
        
        //assigning buttons
        register=new JButton("Register");
        create_Account=new JButton("Create A New Account");
        
        //set properties for buttons
        register.setBounds(700,450,400,100);
        register.setFont((new Font(null,Font.BOLD,20)));
        register.setBackground(new Color(207, 251, 255));
        register.addActionListener(this);
        
        create_Account.setBounds(200,450,400,100);
        create_Account.setFont((new Font(null,Font.BOLD,20)));
        create_Account.setBackground(new Color(207, 251, 255));
        create_Account.addActionListener(this);
        
        //assigning text fields
        id=new JTextField();
        password=new JTextField();
        //set properties
        id.setBounds(500,200,400,80);
        id.setFont((new Font(null,Font.BOLD,40)));
         
        password.setBounds(500,300,400,80);
        password.setFont((new Font(null,Font.BOLD,40)));
        
        //jframe properties
        
        this.setTitle("Create Account Window");
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1400,700);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.add(idd);
        this.add(pass);
        this.add(id);
        this.add(password);
        this.add(register);
        this.add(create_Account);
        this.add(title);
        this.add(p1);
        this.add(p2);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try{
            //when click on register
        if(ae.getSource()==register) {
            w=(int)(Double.parseDouble(id.getText().substring(5,id.getText().length())));//converting text that after first 4 numbers to int
            //if password correct
            if (password.getText().equals((IDofclient.get(w)).getPassword())) {
                this.dispose();
                (IDofclient.get(w)).openhomepage();
            }
            //if password is wrong
            else
                JOptionPane.showMessageDialog(null,"you have entered the wrong password the wrong ID","Error",JOptionPane.ERROR_MESSAGE );
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"There Field(s) That Is Empty \n or password or ID is wrong!!","Error",JOptionPane.ERROR_MESSAGE );
        }
        //when click on create account
        if(ae.getSource()==create_Account)
        {
            this.dispose();
        new Createaccountwindow();
        }
    }
    
}
