package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       Person per1 = new Person();
        per1.name = "Wahhab";
        per1.age = 33;
        System.out.println(per1.age + " " + per1.name);

        /*
         * write a program that ask the user about the number of his family, then ask him about their names, then ask him
         * about their ages, then display the result.
         */
        // now this is the normal way, but it's too hard and long :
          System.out.println("please enter the number of the family: ");
        int numPer = obj.nextInt();
        // System.out.println(numPer);
        System.out.println("please enter their names: ");
        String names[] = new String[numPer];

        for (int i = 0; i < numPer; i++)
        {
            names[i] = obj.next();//  we lose one value when we write nextLine because it is a loop in loop we don't use lin
            System.out.println(names[i]);
        }
        System.out.println("please enter their ages :");
        int ages[] = new int[numPer];
        for (int i = 0; i < numPer; i++)
        {
            ages[i]=obj.nextInt();
            System.out.println(ages[i]);
        }
        // now the other way, that depend on  an object from another class :
        System.out.println("please enter the number of the family: ");
        numPer = obj.nextInt();
       Person person =new Person(); // here we make an object that has two elements 1.name 2.age
        for (int i=0;i<numPer;i++)
        {
            System.out.println("please enter name person " + (i+1)+ ":");
            person.name =obj.next();
            System.out.println("please enter age person "+ (i+1)+ ":");
            person.age =obj.nextInt();
            System.out.println(person.name+" "+ person.age);
            // here will the result just display after the entered value. **********
        }

        // now the new and the good way, that depend on  an object from another class :

        System.out.println("please enter the number of the family: ");
         numPer = obj.nextInt();
         // here we make an object that has two elements 1.name 2.age
        // now we want that the entered value is displayed at the end of the program, so we should use the array:
        Person personList[]= new Person[numPer];

        for (int i=0;i<numPer;i++)
        {
            Person personF =new Person();
            System.out.println("please enter name person " + (i+1)+ ":");
            personF.name =obj.next();
            System.out.println("please enter age person "+ (i+1)+ ":");
            personF.age =obj.nextInt();
            // here will the result just display after the entered value. **********
            personList[i]= personF;

        }

        for (int i = 0;i<numPer;i++)// or for (int i = 0;i<personList[i].length;i++)
        // System.out.println(personF.name +" "+ personF.age);wrong because will give the same result from the first personF two time
          System.out.println(personList[i].name +" "+ personList[i].age);
        //************************************************************************************************************************************

        // method lecture :
        Person personNew = new Person();
        personNew.printRegards();
        Person number = new Person();
        number.sum(6, 9);// nothing will be had seen , so :
        System.out.println(number.sum(6, 9)); // or :
        int add = number.sum(6, 9);
        System.out.println(add);
        personNew.setName("Wahhab");
        System.out.println(personNew.name);
        personNew.setAge(33);
        System.out.println( personNew.age);
        //**************************
        //**************************
        //*****     this     *******
        //*****     ^ - ^    *******
        //**************************
        //**************************
        personNew.color = "green";
        personNew.setColor("black");
        System.out.println(personNew.color);// look here we get green not black and when it hasn't a value we get null
        // so we use ***" this "***
        personNew.setTall(167.3f);
        System.out.println(personNew.tall);// here tall has no value before, but we didn't get null













    }
}
 /*
      ;
        for( int i = 0; i < 10;i++)
        {
           if (i<= 4)
                break;
            System.out.println("hello");
        }
         for( int i = 0; i < 10;i++)
        {
           if (i<= 4)
              continue;
            System.out.println("hello");
        }

*/