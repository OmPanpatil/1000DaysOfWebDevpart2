package day83;

import java.util.Scanner;

public class day83_prob3 {
    public static void main(String[] args) {
        /*

        if-else if - else statement:

        if(){

        }
        else if(){

        }
        else{

        }


        */
        
        // Problem is of Income Tax Calculator
        // income<5L (0% tax), income tax between 5-10L (20% tax), income > 10L (30% tax )

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print(" Enter the desired income of the candidate to calculate its income with tax : ");
            int income = Sc.nextInt();
            int tax;

            if (income <= 500000) {
                tax = 0;
            }
            else if( income>500000 && income<=100000) {
                tax = (int)(income*0.2);
            }

            else{
                tax = (int)(income*0.3);

            }

            System.out.println("Your income tax is : " + tax);
        }
        
    }
}
