package com.example.oop.basics;

public class Student {
    // write the code of student class here
    int age;
    String name;

    void display(){
        System.out.println("My name is "+name+". I am "+age+" years old");
    }

    void sayHello(String param){
        System.out.println(name+" says hello to "+param);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Riya";
        s.age = 30;
        s.display();
        s.sayHello("Bhagyashri");

        System.out.println("****************************************");

        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        s1.display();

        Student s2 = s1;
        s2.age = 20;
        s2.name = "B";

        s2.display();

        s1.display();

        System.out.println("****************************************");

        Student s3 = new Student();
        s3.age = 10;
        s3.name = "A";

        Student s4 = new Student();

        Student temp = s3;
        s3 = s4;
        s4 = temp;

        s4.display();

        System.out.println("****************************************");

        Student s5 = new Student();
        s5.age = 10;
        s5.name = "A";

        Student s6 = new Student();

        int tempAge = s5.age;
        s5.age = s6.age;
        s6.age = tempAge;

        s6.display();

        System.out.println("****************************************");

        Student s7 = new Student();
        s7.age = 10;
        s7.name = "A";

        Student s8 = new Student();

        String tempName = s7.name;
        s7.name = s8.name;
        s8.name = tempName;

        s7.display();

        System.out.println("****************************************");

        Student s9 = new Student();
        s9.age = 10;
        s9.name = "A";

        Student s10 = new Student();
        s10.age = 20;
        s10.name = "B";

        swap(s9, s10);

        s9.display();

        System.out.println("****************************************");

        Student s11 = new Student();
        s11.age = 10;
        s11.name = "A";

        Student s12 = new Student();
        s12.age = 20;
        s12.name = "B";

        swap_1(s11, s12);

        s11.display();
    }

    private static void swap(Student s1, Student s2) {
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }

    private static void swap_1(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
}
