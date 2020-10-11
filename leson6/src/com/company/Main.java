package com.company;
import java.util.*;
public class Main {

    public static void main(String[] arrgs){

        Scanner s = new Scanner(System.in);
        int one =s.nextInt();
        String two =s.next();
        int three =s.nextInt();
        if (two.equals("+")) {
            System.out.println(sum(one, three));
        } else if(two.equals("-")) {
            System.out.println(subs(one, three));
        }else if(two.equals("*")) {
            System.out.println(mult(one, three));
        }else if(two.equals("/")) {
            System.out.println(dived(one, three));
        }
    }

    public static int sum(int first,int second) {
        return (first + second);
    }
    public static int mult(int first,int second) {
        return (first * second);
    }
    public static int subs(int first,int second) {
        return (first - second);
    }
    public static float dived(int first,int second){
        return (first/second);
	// write your code here
    }
}
