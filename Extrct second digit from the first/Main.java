import java.util.*;
public class Main
{
  public static void main(String []agt){
  Scanner sc=new Scanner(System.in);
  int h=sc.nextInt();
  int num=0;
  while(h>100)
  {
    h=h/10;
  }
    System.out.println(h%10);
}
}