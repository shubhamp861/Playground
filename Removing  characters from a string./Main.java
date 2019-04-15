import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String h=sc.next();
    String k=sc.next();
    for(int i=0;i<k.length();i++)
    { 
    h=  h.replaceAll(String.valueOf(k.charAt(i)),"");
    }
    System.out.println(h);
  }
}