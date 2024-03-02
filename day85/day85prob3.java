package day85;

import java.util.Scanner;

public class day85prob3 {
    public static void main(String[] args) {
        /*
        for(initialization, condition, updation){

        }
        */ 

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter your desired number : ");
            int range = Sc.nextInt();

            for(int i=1; i<=range; i++){
                System.out.println(i);
            }
            

        }
    }
}
