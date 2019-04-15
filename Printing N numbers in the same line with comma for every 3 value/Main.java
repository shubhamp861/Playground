import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int h=0;
    for(int i=1;i<=num;i++)
    {
      System.out.print(i);
      h++;
      if(h==3){
      System.out.print(",");h=0;}
    }
  }
}