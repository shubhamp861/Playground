import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        int ex=sc.nextInt();
      int h=1;
      while(ex!=0)
      {
        h *=num;
        ex--;
      }
      System.out.println(h);
    }
}