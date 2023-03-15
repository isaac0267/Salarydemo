package Menu;

import com.example.salary.Employ;
import com.example.salary.SalaryApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadMenu  {
    // This method will print the head menu for the user.
 public static void  headMenu() {
     SalaryApplication data=new SalaryApplication();
     Employ employ= new Employ();
     Scanner sc = new Scanner(System.in);
     System.out.println("Welcome to the website");
     while (true)  {
         System.out.println("1-)  Enter one to register name"+"\n" +
                            "2-)  Enter two to see salary"+"\n"+
                            "3-)  Enter three to see the info about the Employ ");

       String user= sc.nextLine();
         if (user.equalsIgnoreCase("1")) {
           data.registerName();
         } else if (user.equals("2")) {
            double result=SalaryApplication.salary(10,12);
             System.out.println("This is amount of the money that you make per year: "+(int)result);
         }else{
             SalaryApplication.employInfo();
         }
     }
 }
}
