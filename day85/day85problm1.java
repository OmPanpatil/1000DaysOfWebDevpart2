package day85;

import java.util.Scanner;

public class day85problm1 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your number to be dispayed : ");
            int range = Sc.nextInt();

            int counter=1;

            while (counter<=range) {
                System.out.print(counter + " ");
                counter++;
            }
        }
    }
}
