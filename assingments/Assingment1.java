package com.assingments;
import java.util.Scanner;
public class Assingment1 {

        public static void main(String args[]) {
            try{
                System.out.println("start of main..");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter num1");
                int num1 = sc.nextInt();
                System.out.println("Enter num2");
                int num2 = sc.nextInt();
                String message = null;
                int num3 = num1 / num2;
                if(num3 > 10){
                    message = "Welcome to Exception Handling ";
                }
                System.out.println("Message is :"+message.toUpperCase());


            }


            catch (ArithmeticException ae){
                System.out.println("num2 should not be 0");
            }
            catch (NullPointerException npe){
                System.out.println("String value is null");
            }
            catch(Exception e){
                System.out.println("Please Enter a valid number");
            }

            System.out.println("end of main");

        }
    }