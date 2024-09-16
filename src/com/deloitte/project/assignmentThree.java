// Assignment 3: Constructors and Overloading

package com.deloitte.project;

public class assignmentThree {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        System.out.println(obj1.calculateArea());

        obj1 = null;

        Rectangle obj2 = new Rectangle(104.7778, 55.5);
        System.out.println(obj2.calculateArea());

        obj2 = null;
    }
}

class Rectangle{

    double length = 10.5;
    double width = 14.677;

    Rectangle(){

    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }

}