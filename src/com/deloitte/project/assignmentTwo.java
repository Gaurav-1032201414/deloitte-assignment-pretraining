// Assignment 2: Class Definition and Methods

package com.deloitte.project;

public class assignmentTwo {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.name = "Gaurav";
        obj1.age = 22;
        obj1.gender = "male";

        System.out.println(obj1.displayPersonalInfo());

        obj1 = null;

        Person[] people = {
                new Person("Sonu", 34, "Female"),
                new Person("Mongo", 34, "Male"),
                new Person("Slime", 34, "Male"),
        };

        for(Person person: people){
            System.out.println(person.displayPersonalInfo());
        }

    }
}

class Person{

    String name;
    int age;
    String gender;

    Person(){

    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String displayPersonalInfo(){
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender;
    }

}
