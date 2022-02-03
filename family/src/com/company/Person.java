package com.company;

public class Person {
    String name;
    int age;
    String color;
    float tall;
    void printRegards()
    {
        System.out.println("Salam alaykom");
    }
    //**************
    int sum(int x,int y)
    {
        return x+y;
    }
    void setName (String newName)
    {
        name = newName ;
    }
    void setAge (int newAge)
    {
        age =newAge ;
    }

    //**************************
    //**************************
    //*****     this     *******
    //*****     ^ - ^    *******
    //**************************
    //**************************

    void setColor (String color)
    {
        color = color;// here the program take the value from the class not from the method void()
    }
    void setTall(float tall)
    {
        this.tall = tall;
    }

}
