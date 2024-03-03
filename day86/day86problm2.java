package day86;

import java.util.Scanner;

public class day86problm2 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter the number you want to rverse : ");
            int number = Sc.nextInt();
            int reverse=0;
            while (number>0) {
                int lastdigit = number%10;
                reverse = (reverse*10)+lastdigit;
                number/=10;
                System.out.print(lastdigit + " ");
            }
        }
    }
}
