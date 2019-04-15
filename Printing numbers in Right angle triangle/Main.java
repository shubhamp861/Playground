import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
       int y1=sc.nextInt();
       for(int i=1;i<=y1;i++)
       {
         for(int y=0;y<i;y++)
         {
           System.out.print(i);
         }System.out.println();
       }
	}
}