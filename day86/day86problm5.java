package day86;

import java.util.Scanner;

public class day86problm5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            do {
                System.out.print("ENter the number : ");
                int number = Sc.nextInt();
                if (number%10==0) {
                    break;
                }
                System.out.println(number);
                number++;
            } while(true);
        }
        System.out.println("these are the multiple of 10. ");
    }
}
