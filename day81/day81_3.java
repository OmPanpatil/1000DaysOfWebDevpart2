import java.util.Scanner;

public class day81_3 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Put your Radius :");
            float radius = Sc.nextFloat();
            float Areaofcircle = (3.14f * radius * radius);
            System.out.println("The area of circle is : " +  Areaofcircle);
        } 
    }
}
