package bankproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Createaccountwindow extends JFrame implements ActionListener{
    JLabel namel,workl,homel,emaill,statusl,NationalIDl,phonenumberl,homenumberl,passwordl,dateofbirthl;
    JTextField namet,workt,homet,emailt,statust,NationalIDt,phonenumbert,homenumbert,passwordt,dateofbirtht;
    JButton create,back;
    public static ArrayList<Client> IDofclient=new ArrayList<Client>();
    public Createaccountwindow() {   
        
        //assigning the variables
        
       namel=new JLabel("Enter Your Name :");
       workl=new JLabel("Enter Your Job :");
       homel=new JLabel("Enter Your Home Location :");
       emaill=new JLabel("Enter Your Email address :");
       statusl=new JLabel("Enter Your Social Status :");
       NationalIDl=new JLabel("Enter Your National ID :");
       phonenumberl=new JLabel("Enter Your Phone Number :");
       homenumberl=new JLabel("Enter Your Home Number :");
       passwordl=new JLabel("Enter Your Password :");
       dateofbirthl=new JLabel("Enter Your Date Of Birth :");
       
       //set prperties for labels
       
       namel.setBounds(20,20,400,40);
       namel.setFont((new Font(null,Font.BOLD,30)));
      
       workl.setBounds(20,80,400,40);
       workl.setFont((new Font(null,Font.BOLD,30)));
      
       homel.setBounds(20,140,400,40);
       homel.setFont((new Font(null,Font.BOLD,30)));
       
       emaill.setBounds(20,200,400,40);
       emaill.setFont((new Font(null,Font.BOLD,30)));
  
       statusl.setBounds(20,260,400,40);
       statusl.setFont((new Font(null,Font.BOLD,30)));
      
       NationalIDl.setBounds(20,320,400,40);
       NationalIDl.setFont((new Font(null,Font.BOLD,30)));
      
       phonenumberl.setBounds(20,380,400,40);
       phonenumberl.setFont((new Font(null,Font.BOLD,30)));
      
       homenumberl.setBounds(20,440,400,40);
       homenumberl.setFont((new Font(null,Font.BOLD,30)));
       
       passwordl.setBounds(20,500,400,40);
       passwordl.setFont((new Font(null,Font.BOLD,30)));
       
       dateofbirthl.setBounds(20,560,400,40);
       dateofbirthl.setFont((new Font(null,Font.BOLD,30)));
       
        
           //assigning textfields
           
       namet=new JTextField();
       workt=new JTextField();
       homet=new JTextField();
       emailt=new JTextField();
       statust=new JTextField();
       NationalIDt=new JTextField();
       phonenumbert=new JTextField();
       homenumbert=new JTextField();
       passwordt=new JTextField();
       dateofbirtht=new JTextField();
       
       //set properties
       
       namet.setBounds(420,20,600,40);
       namet.setFont((new Font(null,Font.BOLD,30)));
       namet.addActionListener(this);
       namet.setBackground(new Color(0xbde0ff));
       
       workt.setBounds(420,80,600,40);
       workt.setFont((new Font(null,Font.BOLD,30)));
       workt.addActionListener(this);
       workt.setBackground(new Color(0xbde0ff));
       
       homet.setBounds(420,140,600,40);
       homet.setFont((new Font(null,Font.BOLD,30)));
       homet.addActionListener(this);
       homet.setBackground(new Color(0xbde0ff));
       
       emailt.setBounds(420,200,600,40);
       emailt.setFont((new Font(null,Font.BOLD,30)));
       emailt.addActionListener(this);
       emailt.setBackground(new Color(0xbde0ff));
       
       statust.setBounds(420,260,600,40);
       statust.setFont((new Font(null,Font.BOLD,30)));
       statust.addActionListener(this);
       statust.setBackground(new Color(0xbde0ff));
       
       NationalIDt.setBounds(420,320,600,40);
       NationalIDt.setFont((new Font(null,Font.BOLD,30)));
       NationalIDt.addActionListener(this);
       NationalIDt.setBackground(new Color(0xbde0ff));
       
       phonenumbert.setBounds(420,380,600,40);
       phonenumbert.setFont((new Font(null,Font.BOLD,30)));
       phonenumbert.addActionListener(this);
       phonenumbert.setBackground(new Color(0xbde0ff));
       
       homenumbert.setBounds(420,440,600,40);
       homenumbert.setFont((new Font(null,Font.BOLD,30)));
       homenumbert.addActionListener(this);
       homenumbert.setBackground(new Color(0xbde0ff));
       
       passwordt.setBounds(420,500,600,40);
       passwordt.setFont((new Font(null,Font.BOLD,30)));
       passwordt.addActionListener(this);
       passwordt.setBackground(new Color(0xbde0ff));
       
       dateofbirtht.setBounds(420,560,600,40);
       dateofbirtht.setFont((new Font(null,Font.BOLD,30)));
       dateofbirtht.addActionListener(this);
       dateofbirtht.setBackground(new Color(0xbde0ff));
       
       //assigning buttons
       
       create=new JButton("Create");
       back=new JButton("Back");
       
       //set properties
       
       create.setBounds(1050,650,300,100); 
       create.setFont((new Font(null,Font.BOLD,40)));
       create.addActionListener(this);
       back.setBounds(700,650,300,100); 
       back.setFont((new Font(null,Font.BOLD,40)));
       back.addActionListener(this);
       
       //intializing panels
       
       JPanel pq,pw;
       pq=new JPanel();
       pw=new JPanel();
       
       //set properties
       
       pq.setBounds(0,0,1400,625);
       pq.setBackground(new Color(255, 215, 0));
       
       pw.setBounds(0,625,1400,200);
       pw.setBackground(new Color(163, 0, 0));
        
        // JFrame properties
         
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1400,800);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setLayout(null);
        this.setResizable(false);
        
        this.add(namel);
        this.add(namet);
        this.add(workl);
        this.add(workt);
        this.add(homel);
        this.add(homet);
        this.add(emaill);
        this.add(emailt);
        this.add(statusl);
        this.add(statust);
        this.add(NationalIDl);
        this.add(NationalIDt);
        this.add(phonenumberl);
        this.add(phonenumbert);
        this.add(homenumberl);
        this.add(homenumbert);
        this.add(passwordl);
        this.add(passwordt);
        this.add(dateofbirthl);
        this.add(dateofbirtht);
        this.add(create);
        this.add(back);
        this.add(pq);
        this.add(pw);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double k;
        
        //when click on create button
        
        if(ae.getSource()==create)
        {
            k=1;
           try{
           
        IDofclient.add(new Client());
        
        IDofclient.get(IDofclient.size()-1).setName(namet.getText());
        IDofclient.get(IDofclient.size()-1).setWork(workt.getText());
        IDofclient.get(IDofclient.size()-1).setHome(homet.getText());
        IDofclient.get(IDofclient.size()-1).setEmail(emailt.getText());
        IDofclient.get(IDofclient.size()-1).setStatus(statust.getText());
        IDofclient.get(IDofclient.size()-1).setNationalID(Double.parseDouble(NationalIDt.getText()));
        IDofclient.get(IDofclient.size()-1).setPhonenumber(Double.parseDouble(phonenumbert.getText()));
        IDofclient.get(IDofclient.size()-1).setHomenumber(Double.parseDouble(homenumbert.getText()));
        IDofclient.get(IDofclient.size()-1).setPassword(passwordt.getText());
        IDofclient.get(IDofclient.size()-1).setDateofbirth(dateofbirtht.getText());
        IDofclient.get(IDofclient.size()-1).setBalance(0);
        IDofclient.get(IDofclient.size()-1).setCertificates(0);
        IDofclient.get(IDofclient.size()-1).setDeposits(0);
        IDofclient.get(IDofclient.size()-1).setLoans(0);
        IDofclient.get(IDofclient.size()-1).setCertificatestime(0);
        IDofclient.get(IDofclient.size()-1).setDepositstime(0);
        IDofclient.get(IDofclient.size()-1).setLoanstime(0);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"There Field(s) That Is Empty","Error",JOptionPane.ERROR_MESSAGE );
            k=0;
        }
           //if data is ok and threr is no exception
        if(k==1)
        {
            JOptionPane.showMessageDialog(null,"Your ID is :"+22011+(IDofclient.size()-1),"Information",JOptionPane.INFORMATION_MESSAGE );
        this.dispose();
        new StartPage();
        }
        }
        
        //when click on back button
        if(ae.getSource()==back)
        {
        this.dispose();
        new StartPage();
        }
        
        
    }
    
}
