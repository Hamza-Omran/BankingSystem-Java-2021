package bankproject;

import static bankproject.Createaccountwindow.IDofclient;
import static bankproject.StartPage.w;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Certificates extends MenuBar implements ActionListener {
        JTextField Certificateammount,Certificatetime;
        JButton agree;
        JLabel ammount,time,tit,interest;
    Certificates() {
        
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        
        p1.setBounds(0,0,1900,170);
        p1.setBackground(new Color(255, 215, 0));
        
        p2.setBounds(0,170,1900,680);
        p2.setBackground(new Color(192,192,192));
        
        p3.setBounds(20,380,410,130);
        p3.setBackground(new Color(255, 215, 0));
        
        tit=new JLabel("Welcome To Certificates Manager");
        
        tit.setBounds(500,-70,900,320);
        tit.setFont((new Font(null,Font.BOLD,50)));
        
        ammount =new JLabel("Enter Certificate Ammount :");
        time=new JLabel("Enter Period For The Certificate (Years) : ");
        interest=new JLabel("The interest is 10% ");
        
        ammount.setBounds(200,200,630,80);
        ammount.setFont(new Font(null,Font.BOLD,35));
        
        time.setBounds(70,300,700,80);
        time.setFont(new Font(null,Font.BOLD,35));
        
        interest.setBounds(70,400,700,80);
        interest.setFont(new Font(null,Font.BOLD,35));
        
        agree=new JButton("Agree");
        
        
        
        agree.setBounds(1500,500,200,100);
        agree.setFont((new Font(null,Font.BOLD,40)));
        agree.addActionListener(this);
        
        Certificateammount =new JTextField();
        Certificatetime=new JTextField();
        
        Certificateammount.setBounds(750,200,400,80);
        Certificateammount.setFont((new Font(null,Font.BOLD,40)));
        Certificateammount.addActionListener(this);
        Certificatetime.setBounds(750,300,400,80);
        Certificatetime.setFont((new Font(null,Font.BOLD,40)));
        Certificatetime.addActionListener(this);

        this.setTitle("Certificates Window");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1900,850);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setJMenuBar(menu);
        
     
        this.add(Certificateammount);
        this.add(Certificatetime);
        this.add(agree);
        this.add(ammount);
        this.add(time);
        this.add(tit);
        this.add(interest);
        this.add(p1);
        this.add(p3);
        this.add(p2);
    
    }
    
@Override
public void actionPerformed(ActionEvent ae) {
    super.actionPerformed(ae);
        if(ae.getSource()==agree)
        {
        try
        {
        double x=Double.parseDouble(Certificateammount.getText());
        double y=Double.parseDouble(Certificatetime.getText());
        if(x>=1000&&y>=1&&x<=IDofclient.get(w).getBalance())
        {
         IDofclient.get(w).setCertificates(x+IDofclient.get(w).getCertificates());
         IDofclient.get(w).setCertificatestime(y);
         IDofclient.get(w).setBalance(IDofclient.get(w).getBalance()-x);
         JOptionPane.showMessageDialog(null,"Congrats Certificate has been added.","Error",JOptionPane.INFORMATION_MESSAGE );
        }
        else
            JOptionPane.showMessageDialog(null,"Enter a number more than 1000\n and less than or equal to "+IDofclient.get(w).getBalance(),"Error",JOptionPane.INFORMATION_MESSAGE );
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"There Field(s) That Is Empty \n(please enter numerical values)","Error",JOptionPane.INFORMATION_MESSAGE );
        }
        }
    }
}
