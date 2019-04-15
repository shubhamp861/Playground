import java.util.*; 
import java.lang.*; 
  
public class Main{ 
      
 public static int firstDigit(int n) 
    { 
       
        while (n >= 10)  
            n /= 10; 
      
        
        return n; 
    } 
  
   
    public static int lastDigit(int n) 
    { 
       
        return (n % 10); 
    } 
      
  
    public static void main(String argc[]) 
    { 
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(firstDigit(n)+ lastDigit(n)); 
    } 
} 