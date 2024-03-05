package day87;

import java.util.Scanner;


public class day87 {
    public static void main(String[] args) {
        /*
        to  check if a number is prime or not
        */ 

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check if it is prime or not : ");
            int number = Sc.nextInt();
            
            if (number == 2) {
                System.out.println("It is prime.");
            } else {
                    boolean isprime = true;
                    for(int i = 1; i<=Math.sqrt(number); i++){
                        if (number%i == 0) {
                        isprime=false;
                        }
                    }
   
                    if (isprime==true) {
                        System.out.println("It is prime number");
                    } else 
                    {
                        System.out.println("number is not prime"); 
                    }


                
                }
        }


    }
}
