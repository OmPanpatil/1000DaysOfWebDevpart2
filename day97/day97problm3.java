package day97;

public class day97problm3 {

    // Print all primes in a range

    public static boolean isprime(int n){
        for( int i =2; i<=Math.sqrt(i);i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void primeisinrange(int n){
        for( int i=2; i<=n;i++ ){
            if (isprime(i)) { //becomes true then print the number
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
       primeisinrange(40); 
    }
}
