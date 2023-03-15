package com.example.salary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class SalaryApplication {
    @GetMapping("/")
     // creat a method
    // I make some comment in this class. 
    public static void registerName() {
        Employ employ= new Employ();
        String user="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our program do you want to enter the website");
        user=sc.nextLine();
        if (user.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the system");
            System.out.println("Please enter your first name "+" ");
            employ.setfName(sc.nextLine());
            System.out.println("Enter the last name ");
            employ.setlName(sc.nextLine());
            String fulName= employ.getfName()+" "+employ.getlName();
            System.out.println("Your whole name is "+" "+fulName);

        }else{
            System.out.println("Thanks for your time");
        }
    }


}
