package day90;

import java.util.Scanner;

public class day90 {

    public static int calculatesum(int num1 , int num2){ //parametters or formal or definition
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {

        /*
        Syntax with parameters 

        returntype name(type param1, type param2){
            body;
            return statement;
        } 
        */ 

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your first number : ");
            int a = Sc.nextInt();
            System.out.print("Enter your Second number : ");
            int b = Sc.nextInt(); //arguments or informal 
            int sum = calculatesum(a,b);
            System.out.println("Sum of the two number is : " + sum);
        }


        
    }
}
