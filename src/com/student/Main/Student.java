package com.student.Main;

public class Student {
    public static void main(String[] args) {

        //Create objects
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        Person1 person3 = new Person1();
        Person1 person4 = new Person1();

        person1.inputData();
        person2.inputData();
        person3.inputData();
        person4.inputData();
        person1.display();
        person2.display();
        person3.display();
        person4.display();

//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter name: ");
//        String name = input.nextLine();
//
//        System.out.print("Please enter mark: ");
//        int mark = input.nextInt();
//
//        System.out.println("Hello " + name + ", your mark is = " + mark);

    }
}