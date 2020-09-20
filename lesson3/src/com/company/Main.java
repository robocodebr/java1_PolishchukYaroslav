package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner;
        scanner = new Scanner(System.in);
       /*

        String first = scanner.nextLine();

        String surname = scanner.nextLine();

        String secondName = scanner.nextLine();
        System.out.println("our String "+secondName +" " +surname + " " +name);
        int i =scanner.nextInt();
        int g =scanner.nextInt();
        String first = scanner.nextLine();

        System.out.println(g+i);
        System.out.println(g-i);
        System.out.println(g*i);
        System.out.println(g/i);

        String text ="text";
        System.out.println(text.equals("textt"));*/
        String s = scanner.nextLine();
        s.charAt(2);
        int i = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        int j = Integer.parseInt(""+s.charAt(3)+""+s.charAt(4));
        if ("+".equals(s.charAt(2) + "")) {
            System.out.println(i+j);
        } else if ("-".equals(s.charAt(2) + "")) {
            System.out.println(i-j);
        } else if ("*".equals(s.charAt(2) + "")) {
            System.out.println(i*j);
        } else if ("/".equals(s.charAt(2) + "")) {
            System.out.println(i/j);
        }
    }






}
