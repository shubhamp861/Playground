import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner (System.in);
      String po=sc.next();
      po=po+po;
      String ch=sc.next();
      //boolean l=
      if(po.contains(ch))
      {
        System.out.println("Yes");
      }
      else
         System.out.println("No");
      
    }
}