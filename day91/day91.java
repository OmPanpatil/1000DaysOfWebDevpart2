package day91;

import java.util.Scanner;

public class day91 {

    public static int squareofnumber(int num1, int num2){
        int product = num1*num2;
        return product;
        
        

    }
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter first number : ");
            int a = Sc.nextInt();
            System.out.print("Enter the second number : ");
            int b = Sc.nextInt();
            int product = squareofnumber(a,b);
            System.out.println("The product of the sum is : " + product);
        };
        
    }
    
}
