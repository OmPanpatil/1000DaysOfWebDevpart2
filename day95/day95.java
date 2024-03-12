package day95;

import java.util.Scanner;

public class day95 {

    public static int factorialofnum(int n){
        int f =1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int n = Sc.nextInt();
            System.out.println("The factorial of your given number is : " + factorialofnum(n));
        }
    }
}
