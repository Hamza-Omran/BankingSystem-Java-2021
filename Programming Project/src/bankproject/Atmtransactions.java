package bankproject;

import static bankproject.Createaccountwindow.IDofclient;
import static bankproject.StartPage.w;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Atmtransactions extends MenuBar implements ActionListener {
    
    JTextField t;
    JButton ok;
    Atmtransactions() {      
        
        t=new JTextField();
        t.setBounds(1000,40,400,100);
        t.setFont((new Font(null,Font.BOLD,40)));
        t.addActionListener(this);
        
        ok=new JButton("Ok");
        ok.setBounds(1200,200,200,90);
        ok.setFont((new Font(null,Font.BOLD,40)));
        ok.addActionListener(this);
        
        JLabel label=new JLabel("Enter The Ammount : ");
        
        label.setBounds(550,40,450,90);
        label.setFont((new Font(null,Font.BOLD,40)));
        
        JLabel dg=new JLabel("Withdraw Money Manager");
        
        dg.setBounds(20,40,400,90);
        dg.setFont((new Font(null,Font.BOLD,30)));
        
        JPanel p1,p2;
        
        p1=new JPanel();
        p2=new JPanel();
        
        p1.setBounds(0,0,480,400);
        p1.setBackground(new Color(171, 181, 163));
        
        p2.setBounds(480,0,1020,400);
        p2.setBackground(new Color(163, 181, 175));
        
        
        this.setTitle("Withdraw Window");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        
        
        this.add(t);
        this.add(ok);
        this.add(label);
        this.add(dg);
        this.add(p1);
        this.add(p2);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae);
        if(ae.getSource()==ok)
        {
            double b=Double.parseDouble(t.getText());
            if(b<=10000&&b>=100)
            {
                if(IDofclient.get(w).getBalance()>=b)
                   {
                      IDofclient.get(w).setBalance((IDofclient.get(w).getBalance()-b));
                      JOptionPane.showMessageDialog(null,"withdrawed successfully","Error",JOptionPane.INFORMATION_MESSAGE );
                   }
                else
                      JOptionPane.showMessageDialog(null,"you don not have enough money","Error",JOptionPane.INFORMATION_MESSAGE );
            }
            else
                JOptionPane.showMessageDialog(null,"you can take from 100 to 10000 ","Error",JOptionPane.INFORMATION_MESSAGE );
                    
        }
        
    }
  }
