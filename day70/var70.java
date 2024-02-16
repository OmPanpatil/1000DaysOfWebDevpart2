package day70;

import java.util.Scanner;

public class var70 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length: ");
            int a = sc.nextInt();
            System.out.println("Enter the breadth: ");
            int b = sc.nextInt();

            int c = 2*(a+b);
            System.out.println(c);
        }
    }
}
