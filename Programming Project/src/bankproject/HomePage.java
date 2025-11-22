package bankproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class HomePage extends MenuBar implements ActionListener{
        
    
    public HomePage(double balan,double certifi,double depos,double loa) {
        
   JLabel balance,certificate,depositmoney,loanmoney,totalmoneyyouhave;    //declaring labels
   
   //assigning labels
   balance=new JLabel("Your Balance is "+balan+" EGP");
   certificate=new JLabel("Your Total Money In Certificates is "+certifi+" EGP");
   depositmoney=new JLabel("Your Total Money In Deposits is "+depos+" EGP");
   loanmoney=new JLabel("Loans On You is "+loa+" EGP");
   totalmoneyyouhave=new JLabel("Total Money You Have is "+(balan+certifi+depos)+" EGP");
   
   //set properties
   
   balance.setBounds(100,0,1900,160);
   balance.setFont(new Font("sansserif",Font.BOLD,40));
   
   certificate.setBounds(100,160,1900,160);
   certificate.setFont(new Font("sansserif",Font.BOLD,40));
   
   depositmoney.setBounds(100,320,1900,160);
   depositmoney.setFont(new Font("sansserif",Font.BOLD,40));
   
   loanmoney.setBounds(100,480,1900,160);
   loanmoney.setFont(new Font("sansserif",Font.BOLD,40));
   
   totalmoneyyouhave.setBounds(100,640,1900,160);
   totalmoneyyouhave.setFont(new Font("sansserif",Font.BOLD,40));
   
   
   
   
   JPanel p1,p2,p3,p4,p5;    //declaring panels
   
   
   //assigning panels
   p1=new JPanel();
   p2=new JPanel();
   p3=new JPanel();
   p4=new JPanel();
   p5=new JPanel();
   
   //set panels properties
        p1.setBounds(0,0,1900,160);
        p1.setBackground(new Color(84, 209, 255));
        
        p2.setBounds(0,160,1900,160);
        p2.setBackground(new Color(192,192,192));
        
        p3.setBounds(0,320,1900,160);
        p3.setBackground(new Color(161, 161, 161));
        
        p4.setBounds(0,480,1900,160);
        p4.setBackground(new Color(250, 94, 27));
        
        p5.setBounds(0,640,1900,160);
        p5.setBackground(new Color(250, 204, 0));
   
        
        //set frame properties
        this.setTitle("Home Page Window");
        setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1900,850);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setLayout(null);
        this.setJMenuBar(menu);
        this.add(balance);
        this.add(certificate);
        this.add(depositmoney);
        this.add(loanmoney);
        this.add(totalmoneyyouhave);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
    }
}