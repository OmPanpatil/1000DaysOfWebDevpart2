package day88;

import java.util.Scanner;

public class pattern3numbers {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int programnumber = Sc.nextInt();

            for(int line =1; line <= programnumber; line++){
                for( int number=1; number<=line; number++){
                    System.out.print(number);
                }

                System.out.println();
            }
        }
    }
}
