import java.util.Scanner;
class Main {
	public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int u=0;
    while(num>0)
    {
      u=u+(num%10);
      num =num/10;
    }
      System.out.println(u);
	}
}