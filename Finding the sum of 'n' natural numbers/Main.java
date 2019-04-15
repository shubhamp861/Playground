import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
       int y=sc.nextInt();
      int sum=0;
      for(int i=y;i>0;i--)
      {
        sum=sum+i;
      }
      System.out.println(sum);
    }
}