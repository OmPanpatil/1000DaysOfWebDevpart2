import java.util.Scanner;

public class day81_2 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Put your first number : ");
            int a = Sc.nextInt();
            System.out.print("Put your second number : ");
            int b = Sc.nextInt();
            int Product = a + b ;
            System.out.println("The product of your number is : " + Product);
        }
    }
}
