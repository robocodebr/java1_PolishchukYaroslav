package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[]{10, 2, 5, 4, 3, 8, 7, 5, 5, 3};
        Scanner s = new Scanner(System.in);
        int sum =0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]>0){
                sum += arr[i];
            }



        }
        System.out.println(sum);
        }




        //String []arr2 = Arrays.copyOf(arr1,5);


         ///Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(arr1));
        /*foarrr (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(50);

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int temp = arr[2];
        arr[2]=arr[3];
        arr[3]= arr[2];
        System.out.println(arr.length);
        for(int i = 1; i<arr.length;i++){
            for(int j =0;j<arr.length-i;j++){
                if (arr[j] > arr[j+1]){
                       int temp = arr[j];
                    arr[j] = arr[ j + 1];
                    arr[j + 1] = temp;*/



    }

