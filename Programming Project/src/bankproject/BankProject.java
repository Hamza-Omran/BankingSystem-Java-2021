package bankproject;

import static bankproject.Createaccountwindow.IDofclient;

public class BankProject {
    public static void main(String[] args) {
        //ID is 220110
        IDofclient.add(new Client());
        
        IDofclient.get(IDofclient.size()-1).setName("hamza");
        IDofclient.get(IDofclient.size()-1).setWork("student");
        IDofclient.get(IDofclient.size()-1).setHome("betash");
        IDofclient.get(IDofclient.size()-1).setEmail("hamza127444@gmail.con");
        IDofclient.get(IDofclient.size()-1).setStatus("unmarried");
        IDofclient.get(IDofclient.size()-1).setNationalID(Double.parseDouble("200000000000"));
        IDofclient.get(IDofclient.size()-1).setPhonenumber(Double.parseDouble("12345679"));
        IDofclient.get(IDofclient.size()-1).setHomenumber(Double.parseDouble("12345678"));
        IDofclient.get(IDofclient.size()-1).setPassword("hamza12345");
        IDofclient.get(IDofclient.size()-1).setDateofbirth("2004/7/5");
        IDofclient.get(IDofclient.size()-1).setBalance(0);
        IDofclient.get(IDofclient.size()-1).setCertificates(0);
        IDofclient.get(IDofclient.size()-1).setDeposits(0);
        IDofclient.get(IDofclient.size()-1).setLoans(0);
        IDofclient.get(IDofclient.size()-1).setCertificatestime(0);
        IDofclient.get(IDofclient.size()-1).setDepositstime(0);
        IDofclient.get(IDofclient.size()-1).setLoanstime(0);
        
        //ID is 220111
        IDofclient.add(new Client());
        
        IDofclient.get(IDofclient.size()-1).setName("hamza");
        IDofclient.get(IDofclient.size()-1).setWork("student");
        IDofclient.get(IDofclient.size()-1).setHome("betash");
        IDofclient.get(IDofclient.size()-1).setEmail("hamza127444@gmail.con");
        IDofclient.get(IDofclient.size()-1).setStatus("unmarried");
        IDofclient.get(IDofclient.size()-1).setNationalID(Double.parseDouble("200000000000"));
        IDofclient.get(IDofclient.size()-1).setPhonenumber(Double.parseDouble("12345679"));
        IDofclient.get(IDofclient.size()-1).setHomenumber(Double.parseDouble("12345678"));
        IDofclient.get(IDofclient.size()-1).setPassword("hamza!@#$%");
        IDofclient.get(IDofclient.size()-1).setDateofbirth("2004/7/5");
        IDofclient.get(IDofclient.size()-1).setBalance(10000);
        IDofclient.get(IDofclient.size()-1).setCertificates(50000);
        IDofclient.get(IDofclient.size()-1).setDeposits(10000);
        IDofclient.get(IDofclient.size()-1).setLoans(0);
        IDofclient.get(IDofclient.size()-1).setCertificatestime(3);
        IDofclient.get(IDofclient.size()-1).setDepositstime(6);
        IDofclient.get(IDofclient.size()-1).setLoanstime(0);
        
        
      new StartPage();
       
       
    }

    public static String noemptyorblankstring(String s)
    {
    s=s.replaceAll("\\s","");
    return s;
    }
    
}
