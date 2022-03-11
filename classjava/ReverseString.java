package com.classjava;
import java.util.Scanner;
public class ReverseString {



        public static String reversString(String originalString) {
            String reverse = "";
            int length = originalString.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse += originalString.charAt(i);
            }
            return reverse;

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String to reverse :");
            String originalString = sc.next();
            String result = reversString(originalString);
            System.out.println("Original String is :" + originalString);
            System.out.println("Reversed String is :" + result);
        }
    }

