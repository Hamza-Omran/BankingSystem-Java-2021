package bankproject;

import java.util.Date;
import java.time.LocalDate;

public class Client {
    public String name,work,home,email,status,dateofbirth,password;
    public double ID,NationalID,phonenumber,homenumber,balance,certificates,deposits,loans,loanstime,certificatestime,depositstime;
    public LocalDate dateofaccount;

    public Client() {
        balance=0;
        deposits=0;
        certificates=0;
        dateofaccount=LocalDate.now();
    }

    public Client(String name, String work, String home, String email, String status, String dateofbirth, String password, double NationalID, double phonenumber, double homenumber) {
        this.name = name;
        this.work = work;
        this.home = home;
        this.email = email;
        this.status = status;
        this.dateofbirth = dateofbirth;
        this.password = password;
        this.NationalID = NationalID;
        this.phonenumber = phonenumber;
        this.homenumber = homenumber;
        balance=0;
        deposits=0;
        certificates=0;
        dateofaccount=LocalDate.now();
    }

    public String getPassword() {
        return password;
    }

    public double getLoanstime() {
        return loanstime;
    }

    public void setLoanstime(double loanstime) {
        this.loanstime = loanstime;
    }

    public double getCertificatestime() {
        return certificatestime;
    }

    public void setCertificatestime(double certificatestime) {
        this.certificatestime = certificatestime;
    }

    public double getDepositstime() {
        return depositstime;
    }

    public void setDepositstime(double depositstime) {
        this.depositstime = depositstime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCertificates() {
        return certificates;
    }

    public void setCertificates(double certificates) {
        this.certificates = certificates;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getLoans() {
        return loans;
    }

    public void setLoans(double loans) {
        this.loans = loans;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public double getNationalID() {
        return NationalID;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public double getHomenumber() {
        return homenumber;
    }



    public LocalDate getDateofaccount() {
        return dateofaccount;
    }

    public double getID() {
        return ID;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNationalID(double NationalID) {
        this.NationalID = NationalID;
    }

    public void setPhonenumber(double phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setHomenumber(double homenumber) {
        this.homenumber = homenumber;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


    public void setDateofaccount(LocalDate dateofaccount) {
        this.dateofaccount = dateofaccount;
    }
    public void openhomepage(){
    new HomePage(this.getBalance(),this.getCertificates(),this.getDeposits(),this.getLoans());
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", work=" + work + ", home=" + home + ", email=" + email + ", status=" + status + ", ID=" + ID + ", NationalID=" + NationalID + ", phonenumber=" + phonenumber + ", homenumber=" + homenumber + ", password=" + password + ", dateofbirth=" + dateofbirth + ", dateofaccount=" + dateofaccount + '}';
    }

}
