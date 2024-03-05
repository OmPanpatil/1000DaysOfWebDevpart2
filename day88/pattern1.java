package day88;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int number = Sc.nextInt();

            for( int line =1; line<=number; line++){
                for( int patternstar = 1; patternstar<=line; patternstar++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
