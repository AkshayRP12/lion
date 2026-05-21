package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        employees.add("Koushik");
        employees.add("Akshay");

        displayEmployees(employees);
    }

    public static List<String> addEmployee(List<String> list, String name){
        list.add(name);
        return list;
    }

    public static int getEmployeeCount(List<String> list){
        return list.size();
    }

    public static void displayEmployees(List<String> list){
        System.out.println("Employee List:");
        for(String emp : list){
            System.out.println("- " + emp);
        }
    }
}
