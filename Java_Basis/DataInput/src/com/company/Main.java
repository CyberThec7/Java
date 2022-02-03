package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date; // :**:

public class Main
{
    public static void main(String[] args)
    {

        // write your code here
        Scanner obj = new Scanner(System.in);
        String name;
        int age;
        System.out.println("please enter your name: ");
        name = obj.nextLine();
        System.out.println("please enter your age: ");
        age = obj.nextInt();

        if (age <= 0 || name == "" || age > 74)
        {
            if (age <= 0)
                System.out.println("age can never <= 0...!!");
            if (name == "")
                System.out.println("name is invalid sorry..!!");
            if (age > 74)
                System.out.println("go die, fuck off, damn...!!");

        }
        else {
            System.out.println("the name is : " + name + " " + "the age is : " + age);
        }
        for(int i=1;i<=age;i++)  // NOTE : here to display all Number that are before the number that thr user has entered
        {
            System.out.println(i);
        }
         for(int i=1; i<=age;i++) // NOTE : here from 0 soi we got even (gerade) Number
        {
            i+=1;
            System.out.println(i);
        }
        for(int i=0; i<=age;i++) // NOTE : here from 0 soi we got odd (ungerade) Number
        {
            i+=1;
            System.out.println(i);
        }
        int sum = 0;
        for(int i= 0; i <= age; i++) //  addition all number from 0 until the entered number
        {
            sum = sum + i;
        }
        System.out.println("the sum of the number addition is :" + sum);

        int num; // how do while repeat without end
        System.out.println("now you should enter a positive number..!!");
        num = obj.nextInt();
        while ( num <= 0)
        {
            System.out.println(" are you serious .. !! please enter positive number");
            num = obj.nextInt();
        }
        System.out.println("cooler number..!!");
        String username1;
        username1 = obj.nextLine();
        do
        {
            System.out.println("enter your username please :");
            username1 = obj.nextLine();
        }while (username1 == "");
        //**************************************************************************************************************
        System.out.println("(: **************************************** :)");
        // Array Lecture :
        int arr[];// the best or :
        int[] arr1;// or :
        int []arr2;
        // in java :
        int arr3[] = {12,34,24,61,89,90}; // or:
        double myArray[]= new double [6];
        for(int i=0;i < arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
        for(int i=0;i < arr3.length;i++)
        {
            System.out.print(arr3[i] + "\t");// here without ln in print
        }
        // now we change the values :
        arr3[0]= 99;
        arr3[5]= 89;
        for(int i=0;i < arr3.length;i++)
        {
            System.out.print("\n"+ arr3[i] + "\t");// here without ln in print
        } // oder :
        for(int i=0;i <= arr3.length-1;i++)
        {
            System.out.print("\n"+ arr3[i] + "\t");// here without ln in print
        }
       // ´´´´´´´´´´´´´´´´´´´´´´´´´´´´´"       "```````````````````````````````
        double userArray1[]= new double[5]; // when you write double number you write 1,2 with comma not (.)
        System.out.println("enter 5 number please .... ");
        userArray1[0] =obj.nextDouble();
        userArray1[1] =obj.nextDouble();
        userArray1[2] =obj.nextDouble();
        userArray1[3] =obj.nextDouble();
        userArray1[4] =obj.nextDouble();
        System.out.println(userArray1[4]);
        System.out.println(userArray1[3]);
        System.out.println(userArray1[2]);
        System.out.println(userArray1[1]);
        System.out.println(userArray1[0]);

        double userArray[]= new double[5];

        for( int i = 0; i < userArray.length;i++)
         {
           System.out.println("enter 5 number please .... ");

           userArray[i] =obj.nextDouble();
          // System.out.println(userArray[i]);
         }
        Arrays.sort(userArray);// sort the values from small value to big value
        for(int i = userArray.length-1; i >= 0;i--)// here should be >= 0 coz the array begin with 0
         {
            System.out.println(userArray[i]);
         }
        //***********************************************************************************
        System.out.println("(: ******************************************************************* :)");
        // to know size of the sentence :
       String welcome = "  hi welcome to our life bitch ..!!   ";
        System.out.println("the length of this sentence is :" + welcome.length());
        // to know witch alphabet has the any number :
        System.out.println("here you see this babe :" + welcome.charAt(16));
        // to know what is the number for the first any alphabet  :
        System.out.println(welcome.indexOf("t"));// it begin from 0
        // when you look for what is number of one word you should know that you will get the number of the first alphabet
        System.out.println(welcome.indexOf("our")); // when you got -1 so there is no word that you choose
        System.out.println(welcome.indexOf("t",9));// you should take the first number and add 1
        System.out.println(welcome.lastIndexOf("h"));

        System.out.println(welcome.substring(14));// to get part of the sentence :
        System.out.println(welcome.substring(3,13));// to take a part from 3 to 13
        System.out.println(welcome.replace("h","H"));// to replace all h or ....
        System.out.println(welcome.replaceFirst("h","H")); // to replace the first h or ....
        System.out.println(welcome.toLowerCase());
        System.out.println(welcome.toUpperCase()); // to change the sentence to UUTRUHGGJ....
        System.out.println(welcome); // that main that we just working on a copy
        // now to delete all spaces on our sentence :
        System.out.println(welcome.trim());
        // to get result if our sentence has any word or any alphabet that we look for it :
        System.out.println(welcome.contains("bitch"));
        System.out.println(welcome.startsWith("lo"));
        System.out.println(welcome.endsWith("lo"));
        //****************************************************************************************************
        System.out.println("String is finished huhuu... !!!!");
        //****************************************************************************************************
        int number = 3;

        if( number == 1 ) {
            System.out.print("one");
        }

        else if( number == 2 ) {
            System.out.print("two");
        }

        else if( number == 3 ) {
            System.out.print("three");
        }

        else if( number >= 4 ) {
            System.out.print("four or greater");
        }

        else {
            System.out.print("negative number");
        }
        //****************************************************************************************

        boolean isMale = false;
        int age1 = 14;

        if(isMale == true)
        {
            System.out.println("Gender: male");

            if( age1 <= 21 )
            {
                System.out.println("He is a young boy");
            }
        }

        else
        {
            System.out.println("Gender: female");

            if (age1 <= 21)
            {
                System.out.println("She is a young girl");
            }
        }
        //********************************************************************************
        // go to the top of the page and look :**:
        Date dateH = new Date();

        // date هنا قمنا بعرض التاريخ الذي تم تخزينه في الكائن
        System.out.println( dateH );
        // هنا قمنا بإنشاء نسخة عنه
        Object date2 = dateH.clone();

        System.out.println( "Original Date: " + dateH );   // هنا قمنا بعرض الكائن الأصلي
        System.out.println( "Cloned Date: " + date2 );     // هنا قمنا بعرض النسخة من هذا الكائن
        //********'''''''''''''''''''''''#####################################################
        try {                              // try هنا قمنا بتجربة الكود الموجود بداخل الجملة
            int[] a = new int [5];         // هنا قمنا بإنشاء مصفوفة تتألف من 5 عناصر
            System.out.println( a[10] );   // catch هنا حاولنا عرض قيمة عنصر غير موجود في المصفوفة, لذلك سيحدث خطأ, مما سيؤدي رمي إستثناء إلى الدالة
        }
        catch( Exception e ) {                                // e هنا سيتم إلتقاط الإستثناء, ثم تخزينه في الكائن
            System.out.println( "Exception thrown: " + e );   // لنعرف طبيعة الخطأ الذي حدث e هنا قمنا بعرض محتوى الكائن
        }

        // بعد الإنتهاء من تجربة الكود سيتم تنفيذ باقي الأوامر الموجودة في البرنامج
        System.out.println( "The program still work properly" );


        String s = "1234567891011121314151617181920212223";
        int a;

        try {
            System.out.println( "s.charAt(28): " + s.charAt(28) );   // s رقم 28 في النص index هنا حاولنا عرض الحرف الموجود على الـ
            a = Integer.parseInt(s);                                 // int لقيمة s هنا حاولنا تحويل قيمة
        }
        catch( StringIndexOutOfBoundsException e1 ) {                // e1 بعدها تقوم بتخزينه في الكائن StringIndexOutOfBoundsException تلتقط الإستثناء الذي نوعه catch هذه الـ
            System.out.println( "Index is not exist in the string!" );
        }
        catch( NumberFormatException e2 ) {                          // e2 بعدها تقوم بتخزينه في الكائن NumberFormatException تلتقط الإستثناء الذي نوعه catch هذه الـ
            System.out.println( "Can't convert 's' to a number because is to long!" );
        }
        catch( Exception e3 ) {                                      // e3 تلتقط أي إستثناء آخر قد يحدث نسينا ذكره, بعدها تقوم بتخزينه في الكائن catch هذه الـ
            System.out.println( "Exception thrown: " + e3 );
        }

        // بعد الإنتهاء من تجربة الكود سيتم تنفيذ باقي الأوامر الموجودة في البرنامج
        System.out.println( "The program still work properly" );
        //*****************************************************************************************************************************

        System.out.println("End the Basis Java .....!!! juuuuhuuuuu .....!!!!");


    }
}
