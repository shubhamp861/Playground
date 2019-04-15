import java.util.*;
class Main
{
  public static void main(String ghb[])
  {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    int l=sc.nextInt();
    int sum=1;
    for(int i=0;i<l;i++)
    {
      sum=sum*y;
    }
    System.out.println(sum);
  }
}