package bankproject;

import static bankproject.Createaccountwindow.IDofclient;
import static bankproject.StartPage.w;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class MenuBar extends JFrame implements ActionListener {
     JMenuBar menu;
     JMenu Pages;
     JMenuItem Home,Exit,certificates,loans,deposits,deposit,withdraw,setinfo;
     ImageIcon icon;
  
    MenuBar() {
        icon=new ImageIcon("download.jpeg");
        
        Pages=new JMenu("Pages");  
        menu=new JMenuBar();
        Home=new JMenuItem("Home    ");
        Exit=new JMenuItem("Exit    ");
        certificates=new JMenuItem("Certificates    ");
        loans=new JMenuItem("Loans  ");
        deposits=new JMenuItem("Deposits    ");
        deposit=new JMenuItem("Deposit Money ");
        withdraw=new JMenuItem("Withdraw Money ");
        setinfo=new JMenuItem("Change Password    ");
        
        Pages.setFont((new Font(null,Font.BOLD,20)));
        Home.setFont((new Font(null,Font.BOLD,20)));
        Exit.setFont((new Font(null,Font.BOLD,20)));
        certificates.setFont((new Font(null,Font.BOLD,20)));
        loans.setFont((new Font(null,Font.BOLD,20)));
        deposits.setFont((new Font(null,Font.BOLD,20)));
        deposit.setFont((new Font(null,Font.BOLD,20)));
        withdraw.setFont((new Font(null,Font.BOLD,20)));
        setinfo.setFont((new Font(null,Font.BOLD,20)));  
        
        // adding menu & pages
        menu.add(Pages);
        Pages.add(Home);
        Pages.add(loans);
        Pages.add(certificates);
        Pages.add(deposits);
        Pages.add(withdraw);
        Pages.add(deposit);
        Pages.add(setinfo);
        Pages.add(Exit); 
        
        
        this.setTitle("");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1900,850);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setJMenuBar(menu);
        this.setIconImage(icon.getImage());
         
        
        Home.addActionListener(this);
        Exit.addActionListener(this);
        certificates.addActionListener(this);
        loans.addActionListener(this);
        deposits.addActionListener(this);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        setinfo.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Home)
        {
            this.dispose();
                (IDofclient.get(w)).openhomepage();
        }
        if(ae.getSource()==Exit)
        {
            this.dispose();
            System.exit(0);
        }
        if(ae.getSource()==certificates)
        {
            this.dispose();
        new Certificates();
        }
        if(ae.getSource()==loans)
        {
            this.dispose();
        new Loans();
        }
        if(ae.getSource()==deposits)
        {
            this.dispose();
        new Deposits();
        }
        if(ae.getSource()==deposit)
        {
            this.dispose();
        new Deposit();
        }
        if(ae.getSource()==setinfo)
        {
            this.dispose();
        new Setinfo();
        }
        if(ae.getSource()==withdraw)
        {
            this.dispose();
        new Atmtransactions();
        }
        
    }
  }
