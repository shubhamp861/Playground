import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for(int i=1;i<=h;i++)
        {
          for(int y=0;y<h;y++)
          {
            System.out.print(i);
          }
          System.out.println();
        }
	}
}