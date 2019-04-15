import java.util.Scanner;
class Main

{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int u=in.nextInt();
    int g=0;
    
    for(int i=0;i<=2;i++)
    {
      int e=u%10;
      g=(g*10)+e;
      u=u/10;
    }
    System.out.println(g);
  }
}