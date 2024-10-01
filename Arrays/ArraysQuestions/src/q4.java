//Problem 3: Java Program to Print the Elements of an Array Present on Even Positions
//Write a Java program that takes an array as input and prints the elements of
//the array present on even positions.
//
//        Input: An array, e.g., [3, 7, 1, 9, 5] Output: 7, 9

import java.util.ArrayList;

public class q4 {
    public static void main(String[] args) {
        int [] arr={3, 7, 1, 9, 5};
        ArrayList<Integer> r= even(arr);
        System.out.println(r);

    }

    public static ArrayList<Integer> even(int[] arr){
        ArrayList<Integer> a=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             if(i%2!=0){
                 a.add(arr[i]);
             }
         }
        return a;
    }
}

