import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Put your first number : ");
            int a = Sc.nextInt();
            System.out.println("Print your second number : ");
            int b = Sc.nextInt();
            int Sum = a+b;
            System.out.println("This is your Sum : " + Sum);
        }
    }

    
}