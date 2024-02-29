package day83;

import java.util.Scanner;

public class day83_prob2 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number = Sc.nextInt();

            if (number%2==0) {
                System.out.println(" This number is Even.");
                
            } 
            else {
                System.out.println("This number is Odd. ");
                
            }
        }

    }
}
