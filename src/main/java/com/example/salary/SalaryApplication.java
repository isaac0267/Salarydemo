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
    // This is new commend.

    public static void registerName() {
        String user="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our program do you want to enter the website");
        user=sc.nextLine();
        if (user.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the system");
        }else{
            System.out.println("Thanks for your time");
        }
    }



}
