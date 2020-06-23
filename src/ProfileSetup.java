

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class ProfileSetup {

    public String name;
    public String surname;
    private String email;
    private String password ;
    private String confirm;

    public ProfileSetup(){ }

    public ProfileSetup(String name, String surname , String email , String password , String confirm){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.confirm=confirm;
    }
    //Getters

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getConfirm() { return confirm; }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setConfirm(String confirm) { this.confirm = confirm; }

    @Override
    public String toString() {
        return "Profile Details" +
                " \nName = " + name +
                " \nSurname = " + surname +
                " \nEmail Adress = " + email +
                " \nPassword =  " + "******" ;
    }

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println("<<<Profile Setup>>>");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = input.next();
        System.out.println("Enter your surname");
        String usersurname = input.next();
        System.out.println("Enter your email address");
        String eAddress = input.next();
        System.out.println("Enter your password");
        String userpassword = input.next();
        System.out.println("Confirm password");
        String confirmP = input.next();

        if(confirmP.equals(userpassword)) {
            List<ProfileSetup> profile = new ArrayList<>();
            ProfileSetup profile1 = new ProfileSetup(username, usersurname, eAddress, userpassword, confirmP);

            profile.add(profile1);
            System.out.println(profile.toString());

            System.out.println("<<<Sign in>>>");
            System.out.println("Enter username");
            String loginname = input.next();
            System.out.println("Enter password");
            String loginpassword = input.next();

            if (loginname.equals(username) && loginpassword.equals(userpassword)) {
                ApplicationProcess ap = new ApplicationProcess();
                ap.apply();
            } else if (!loginname.equals(username) && !loginpassword.equals(userpassword)) {
                JOptionPane.showMessageDialog(null, " User name and Password are incorrect");
            } else if (!loginname.equals(username) && loginname.equals(userpassword)) {
                JOptionPane.showMessageDialog(null, " User name is incorrect");
            } else if (loginname.equals(username) && !loginpassword.equals(userpassword)) {
                JOptionPane.showMessageDialog(null, "Password is incorrect");
            }
        }
        else if(!confirmP.equals(userpassword)){
            JOptionPane.showMessageDialog(null, "Passwords dont match");
        }


    }
}
