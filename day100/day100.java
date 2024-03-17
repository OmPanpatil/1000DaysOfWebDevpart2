import java.util.*;

public class day100 {

 

public static void main(String args[]) {


try (Scanner sc = new Scanner(System.in)) {
    char ch = sc.next().charAt(0);
    
     
    
    //check the conditions and print the values
    
    if(Character.isUpperCase(ch))
    
    {
    
    System.out.println("1");
    
    }
    
    else if(Character.isLowerCase(ch))
    
    {
    
    System.out.println("0");
    
    }
    
    else
    
    {
    
    System.out.println("-1");
    
    }
}

 

}

}