package org.example;

//Write a test for a method that calculates the sum of two integers. --> Done
//Write a test for a method that checks if a given number is even. --> Done
//Write a test for a method that calculates the product of two integers. --> Done
//Write a test for a method that converts a given string to uppercase.
//Write a test for a method that checks if a given number is positive.
public class Main {
    public static void main(String[] args) {
    }
    public static int calculateSum (int a,int b){
        return (a+b);
    }

    public static boolean isEven (int c){
        return (c%2==0);
    }
    public static int multiply (int a,int b){
        return (a*b);
    }
    public static String toUpperCase (String text){
        return text.toUpperCase();
    }

    public static boolean isPositive (int a){
        return (a>0);
    }

}