package day69;

import java.util.Scanner;

public class numberisprime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a positive integer: ");
            int n = sc.nextInt();
            boolean isPrime = checkprime(n);
            int div=2;
            while (div<n) {
                if (n%div==0) {
                    System.out.println("Print not Prime");
                    
                }

                else{
                    System.out.println("Print Prime");
                }
                
            }
        }
    }

    /**
     * @param n
     * @return
     */
    public static boolean checkprime(int n){
        if (n <= 1) {
            return false;
            
        }
        for(int i=2; i <= Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
                
            }
        }
        return true;

    }
}
