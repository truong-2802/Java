package com.student.Main;

import java.util.Scanner;

public class Person1 {
    //Members
    int id;
    String name;
    String email;


    public void display() {

        System.out.println("Name " + this.name);
        System.out.println("Email " + this.email);
        System.out.println("Id " + this.id);
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter id: ");
        this.id = input.nextInt();


        System.out.println("Input completed");
    }

}
