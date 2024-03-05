package day88;

import java.util.Scanner;

public class pattern4character {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int number = Sc.nextInt();
            char ch = 'A';
            for( int line = 1; line<=number;line++){
                for( int chars=1; chars<=line; chars++){
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }
    }
}
