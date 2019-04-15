import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int sum=0;
       int h=sc.nextInt();
        for(int i=0;i<=h;i++)
          sum=sum+i;
      System.out.println(sum);
	}
}