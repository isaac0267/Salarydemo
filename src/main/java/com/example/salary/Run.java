package com.example.salary;

import Menu.HeadMenu;
import org.springframework.boot.SpringApplication;



public class Run {
    public static void main(String[] args) {
        SpringApplication.run(SalaryApplication.class, args);
        HeadMenu.headMenu();

    }
}
