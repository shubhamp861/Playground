import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      if(n>n2)
      {
        if(n>n3)
        {
          System.out.println(n);
        }
      }
      else
      {
        if(n2>n3)
        {System.out.println(n2);}
        else
          System.out.println(n3);
      }
    }
}