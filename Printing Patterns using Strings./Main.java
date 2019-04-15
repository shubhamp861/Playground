import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
    String i=sc.next();
    int d=(i.length())/2;int x=i.length()-1;
    StringBuffer lw=new StringBuffer(); String h="";
    for(int o=d;o<i.length();o++)
    {
      for(int y=x;y>0;y--)
        System.out.print(" ");
      x--;
     h=String.valueOf(i.charAt(o));
      lw.append(h);
      System.out.println(lw);
    }
    for(int o=0;o<d;o++)
    {
      for(int y=x;y>0;y--)
        System.out.print(" ");
      x--;
      h=String.valueOf(i.charAt(o));
      lw.append(h);
      System.out.println(lw);
    }
  }
}