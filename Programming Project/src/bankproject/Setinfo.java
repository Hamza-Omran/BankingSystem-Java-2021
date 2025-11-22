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

public class Setinfo extends MenuBar implements ActionListener {
    JLabel l1;
    JTextField t1;
    JButton save;
    Setinfo() {
        l1=new JLabel("Change Password :");
        
        
        l1.setBounds(40,40,400,100);
        l1.setFont((new Font(null,Font.BOLD,40)));
        
        
        t1=new JTextField();
        
        
        t1.setBounds(510,40,400,90);
        t1.setFont((new Font(null,Font.BOLD,40)));
        
        
        save=new JButton("Save");
        save.setBounds(710,200,200,90);
        save.setFont((new Font(null,Font.BOLD,40)));
        save.addActionListener(this);
        
        JPanel p1,p2;
        p1=new JPanel();
        
        
        p1.setBounds(0,0,1000,450);
        p1.setBackground(new Color(171, 181, 163));
       
        
        this.setTitle("Change Password Window");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setJMenuBar(menu);
        this.add(l1);
        this.add(t1);
        this.add(save);
        this.add(p1);        
    }
    public void actionPerformed(ActionEvent ae) {
      super.actionPerformed(ae);
        if(ae.getSource()==save)
        {
            IDofclient.get(w).setPassword(t1.getText());
            JOptionPane.showMessageDialog(null,"Passsword Changed successfully and your new password is "+IDofclient.get(w).getPassword(),"Error",JOptionPane.INFORMATION_MESSAGE );
        }
    }
  }
