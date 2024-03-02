package day85;

import java.util.Scanner;

public class day85prob4 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter the number of range: ");
            int range = Sc.nextInt();
            for(int num=1; num<=range; num++){
                System.out.println("*****");
            }
        }
    }
}
