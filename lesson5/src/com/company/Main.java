package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Scanner s = new Scanner(System.in);
        int x =s.nextInt();
        if (x % 2== 0)
       System.out.println("even");
        else
            System.out.println("odd");
        Scanner s = new Scanner(System.in);
        int j =s.nextInt();
        int i = 0;
        for( int counter=1; counter <=j;counter++)
        {   i++;
            if (i == 7) {i = 0; }
            }
        switch(i)
        {
            case 1:System.out.println("Monday"); break;
            case 2:System.out.println("Tuesday"); break;
            case 3:System.out.println("Wednesday"); break;
            case 4:System.out.println("Tursday"); break;
            case 5:System.out.println("friday"); break;
            case 6:System.out.println("Saturday"); break;
            case 7:System.out.println("Sunday"); break;
int i = 0;

       int x =s.nextInt();

       do {
            i++;
            Random search =new Random();
            System.out.println(search.nextInt(100));

    }
       while(i<10);
        int i = 0;
        Random search =new Random();
       for(i = 0; i<10; i++){

           System.out.println(search.nextInt(100)-50);*/

        Scanner s = new Scanner(System.in);
        int top =s.nextInt();
        int down =s.nextInt();
        int sum = 0;
        for(; top<=down; top++) {
            sum = sum + top;
            System.out.println(top);
        }
        System.out.println(sum);

    }


}
