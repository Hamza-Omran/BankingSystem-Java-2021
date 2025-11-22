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

public class Loans extends MenuBar implements ActionListener {
        JTextField loanammount,loantime;
        JButton calc ,agree;
        JLabel ammount,time,tit;
    Loans() {
        
        //intializing panels
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        
        //set panels properties
        p1.setBounds(0,0,1900,170);
        p1.setBackground(new Color(250, 94, 27));
        
        p2.setBounds(0,170,1900,680);
        p2.setBackground(new Color(192,192,192));
        
        //asigning labels and set there properties
        tit=new JLabel("Welcome To Loan Manager");
        
        tit.setBounds(620,-70,800,320);
        tit.setFont((new Font(null,Font.BOLD,50)));
        
        ammount =new JLabel("Enter Loan Ammount :");
        time=new JLabel("Enter Period For The Loan (Years) :");
        
        ammount.setBounds(280,200,510,80);
        ammount.setFont(new Font(null,Font.BOLD,35));
        
        time.setBounds(100,300,650,80);
        time.setFont(new Font(null,Font.BOLD,35));
        
        //assigning buttons
        calc=new JButton("Calculate Ammount");
        agree=new JButton("Agree");
        
        //set properties 
        calc.setBounds(950,500,500,100); 
        calc.setFont((new Font(null,Font.BOLD,40)));
        calc.addActionListener(this);
        
        agree.setBounds(1500,500,200,100);
        agree.setFont((new Font(null,Font.BOLD,40)));
        agree.addActionListener(this);
        
        //assigning text fields
        loanammount =new JTextField();
        loantime=new JTextField();
        
        //set properties for text fields
        loanammount.setBounds(750,200,400,80);
        loanammount.setFont((new Font(null,Font.BOLD,40)));
        loanammount.addActionListener(this);

        loantime.setBounds(750,300,400,80);
        loantime.setFont((new Font(null,Font.BOLD,40)));
        loantime.addActionListener(this);
      
      //set frame properties
      
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1900,850);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setJMenuBar(menu);
        this.setTitle("Loans Window");
        this.add(loanammount);
        this.add(loantime);
        this.add(calc);
        this.add(agree);
        this.add(ammount);
        this.add(time);
        this.add(tit);
        this.add(p1);
        this.add(p2);
    
    }
    
@Override
public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae);
        double x=0,x2=0,y=0,k=1;
        if(ae.getSource()==calc)
        {
            try
            {
        x=Double.parseDouble(loanammount.getText());
        x2=Double.parseDouble(loantime.getText());
        y=(x+x*0.1);
        if(x<=0.7*IDofclient.get(w).getBalance())
        {
            JOptionPane.showMessageDialog(null,"you should pay "+y+"\nyou will pay every month "+(y/(x2*12))+"\nfor "+(x2)+" year","Information",JOptionPane.INFORMATION_MESSAGE );
        }
        else
            JOptionPane.showMessageDialog(null,"you can take at most "+(0.7*IDofclient.get(w).getBalance()),"Error",JOptionPane.INFORMATION_MESSAGE );
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"you have to enter numerical values or\nypu have to type somthing!!","Error",JOptionPane.ERROR_MESSAGE );
            }
        }
        try
        {
        if(ae.getSource()==agree)
        {
            x=Double.parseDouble(loanammount.getText());
        x2=Double.parseDouble(loantime.getText());
        y=(x+x*0.1);
        if(x<=0.7*IDofclient.get(w).getBalance())
        {
        IDofclient.get(w).setLoans(y+IDofclient.get(w).getLoans());
        IDofclient.get(w).setLoanstime(x2);
        IDofclient.get(w).setBalance(IDofclient.get(w).getBalance()+x);
        JOptionPane.showMessageDialog(null,"your money has been added","Error",JOptionPane.INFORMATION_MESSAGE );
        }
        else
            JOptionPane.showMessageDialog(null,"you can take at most "+(0.7*IDofclient.get(w).getBalance()),"Error",JOptionPane.INFORMATION_MESSAGE );
        }
        
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"please enter numerical values","Error",JOptionPane.ERROR_MESSAGE );
        }

}
}