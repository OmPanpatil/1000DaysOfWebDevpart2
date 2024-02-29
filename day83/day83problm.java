package day83;

import java.util.Scanner;

public class day83problm {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your first value: ");
            int a = Sc.nextInt();
            System.out.print("Enter your Second value: ");
            int b = Sc.nextInt();
            System.out.println("And your result is here below : ");
            if(a>b){
                System.out.println("a value is greater than the value of b. ");

            }

            else{
                System.out.println("b value is greater than the value of a.");

            }
        }
    }
}
