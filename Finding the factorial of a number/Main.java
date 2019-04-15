import java.util.*;

class Main
{  
  public static int fact(int y)
  { 
   
       int result = 1;
       for (int i = 1; i <= y; i++) 
           result = result * i;
       
       return result;
  }
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(fact(num));
  }
}