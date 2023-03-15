package com.example.salary;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class SalaryApplication {
    @GetMapping("/")
    // creat a method
    // I make some comment in this class
    public static void registerName() {
        Employ employ = new Employ();
        String user = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter the website");
        user = sc.nextLine();
        if (user.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the system");
            System.out.println("Please enter your first name " + " ");
            employ.setfName(sc.nextLine());
            System.out.println("Enter the last name ");
            employ.setlName(sc.nextLine());
            String fulName = employ.getfName() + " " + employ.getlName();
            System.out.println("Your whole name is " + " " + fulName);
        } else {
            System.out.println("Thanks for your time");
        }

    }

    public static double salary(double weeklyHour, double perHour) {
        double checkWeekly = weeklyHour * perHour;
        return checkWeekly * 52;

    }

  static ArrayList<Employ> employs=new ArrayList<>();

    public static ArrayList employInfo() {
        employs.add(new Employ("Isaac", "Levy", 23));
        employs.add(new Employ("Dave", "Chappel", 12));
        employs.add(new Employ("Chris", "Rock", 15));
        employs.add(new Employ("Khabib", "Nurmagomedov", 14));
        for (int i = 0; i < employs.size(); i++) {
            System.out.println(employs.get(i));
        }
        return employs;
    }


    public Employ toString(Employ employ) {
     return employ;
    }
}
