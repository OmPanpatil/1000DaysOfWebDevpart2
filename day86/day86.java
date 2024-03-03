package day86;

public class day86 {
    public static void main(String[] args) {
        // reverse a number require modulu to get remainder and to remove the last digit it requires division by 10

        int number=1000;

        while (number>0) {
            int lastdigit= number%10;
            System.out.print(lastdigit + " ");
            number/=10;
            
        }
        System.out.println();

    }
}
