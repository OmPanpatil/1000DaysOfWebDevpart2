package day85;

import java.util.Scanner;

public class day85prob2 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Import the desired number to find there first natural number : ");
            int range = Sc.nextInt();
            int i = 1;
            int sum = 0;

            while(i<=range){
                sum+=i;
                System.out.println(i);
                i++;
                
            }
            System.out.println("Your Sum of the range is : " + sum);        
    }   }
}
