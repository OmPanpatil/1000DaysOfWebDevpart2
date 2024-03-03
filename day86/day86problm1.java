package day86;

import java.util.Scanner;

public class day86problm1 {
    public static void main(String[] args) {
        // user input to reverse the number

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your number : ");
            int number = Sc.nextInt();

            while (number>0) {
                int lastdigit = number%10;
                number/=10;
                System.out.print(lastdigit  + " ");
            }
        }
    }
}
