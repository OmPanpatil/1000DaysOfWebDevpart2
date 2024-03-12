package day95;

public class day95problm2 {
    // function overloading

    /*
    1. the function which have same name but different parameters by name and data types are known as function overloading
    */ 

    public static int sumoftwonum(int a, int b){
        return a+b;
    }

    public static float sumoftwonum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sumoftwonum(3, 2));
        System.out.println(sumoftwonum(3, 1, 1));
    }
}
