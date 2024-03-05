package day88;

import java.util.Scanner;

class pattern2inver_star {

    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int number = Sc.nextInt();
            for(int line=1; line<=number;line++){
                for(int star=1; star<=(number-line+1);star++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}