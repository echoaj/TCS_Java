package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        byte b= 4;
        short var0 = 400;
        int var = 5;
        long var6 = 70;
        float var2 = 5.564444f;
        double var3 = 5.547356095;
        boolean var4 = false;
        char letter = 'b';
        String name = "Alex";
        int[] array = {4,8,5,2,4,5,7,8,9};
        int[] array2 = new int[10];
        array[0] = 10;
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Rick");
        names.add("ryan");
        names.remove(0);
        System.out.println(names);
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Mike", 80);
        ht.put("lisa", 40);
        ht.put("Andrew", 54);
        System.out.println(ht);
        System.out.println("Lisa age: " + ht.get("lisa"));


        // for loop
        for(int i = 10; i > 0; i -= 2){
            System.out.println(i);
//            System.out.println(b);
//            System.out.println(letter);
//            System.out.println(name);
        }
        System.out.println();

        // while loop
        int j = 0;
        while(j < 10){
            System.out.println(j);
            j += 1;
        }
        System.out.println();

        // do while loop
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k < 10);

        // User input
        Scanner scan = new Scanner(System.in);
        String user_input;
        do {
            System.out.println("Enter 'abc': ");
            user_input = scan.nextLine();
        }while(!user_input.equals("abc"));

        System.out.println();

        // for each loop
        for(int value: array)
        {
            System.out.println(value);
        }

        for(String n: names){
            System.out.println(n);
        }

//        if(var > 40 || var < 20){
//        }else if(var < 30 && var > 40){
//        }else{
//        }
//        names.contains(5);

//      switch statements
        int day_of_week = 0;

        switch (day_of_week){
            case 0:
                System.out.println("Monday");

            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Weekend!");
                break;
        }








    }

}



