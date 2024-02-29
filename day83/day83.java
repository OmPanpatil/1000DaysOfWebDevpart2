package day83;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        try (// initiallizing the variable input
        Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your Age :  ");
            int age = Sc.nextInt();
            if(age>=18){
                System.out.println("Can do adult things like voting, Drive car and bike and many legal activities. ");

            }

            if( age> 13 && age<18){
                System.out.println("You are a Teenager");

            }
            else{
                System.out.println("You are not an adult");

            }
        }
    }
}
