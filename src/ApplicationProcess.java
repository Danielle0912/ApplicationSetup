import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationProcess {

    public String id;
    public String address;
    public String contactNumber ;
    public String salaryRequirements = "";

    public ApplicationProcess(){}

    public ApplicationProcess(String id , String address , String contactNumber , String salaryRequirements){
        this.id=id;
        this.address=address;
        this.contactNumber=contactNumber;
        this.salaryRequirements=salaryRequirements;
    }

    //Getters

    public String getId() { return id; }

    public String getAddress() { return address; }

    public String getContactNumber() { return contactNumber; }

    public String getSalaryRequirements() { return salaryRequirements; }

    //Setters

    public void setId(String id) { this.id = id; }

    public void setAddress(String address) { this.address = address; }

    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public void setSalaryRequirements(String salaryRequirements) { this.salaryRequirements = salaryRequirements;
    }

    @Override
    public String toString() {
        return "Application Details" +
                " \nID = " + id +
                " \nHome Adrress = " + address +
                " \nContact Number = " + contactNumber +
                " \nIncome =  " + salaryRequirements ;
    }

    public void apply(){
        Scanner applicationinput = new Scanner(System.in);

        List<ApplicationProcess> appliaction = new ArrayList<>();

        System.out.println("Enter ID number");
        String userid = applicationinput.next();
        System.out.println("Enter home address");
        String userAddress = applicationinput.next();
        System.out.println("Enter contact number");
        String cellP = applicationinput.next();

        System.out.println("Select Income category ");
        System.out.println(" A. R3000 -R5000   B. R5000 - R10000    C. R10000 - R15000");

        String salaryQualify = applicationinput.next();
        switch (salaryQualify){
            case "A":
                JOptionPane.showMessageDialog(null,"You Qualify for a Food parcel ");
                ApplicationProcess appProcess = new ApplicationProcess( userid , userAddress , cellP ,salaryQualify);
                appliaction.add(appProcess);
                System.out.println( appliaction);
                break;
            case "B":
                JOptionPane.showMessageDialog(null, " Application Pending  ");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, " You dont qualify for a Food parcel");
                break;
            default:
                JOptionPane.showMessageDialog(null, " Invalid input");
                break;
        }

    }
}
