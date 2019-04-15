import java.util.Scanner;
class Main{
    public static int fact(int u)
    { int f=1;
      for(int i=1;i<=u;i++)
      {
        f=f*i;
      }
     return f;
    }
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();int sum=1;
      int lol=String.valueOf(num).length();
       while(num>0)
       {
         int h=num%10;
         sum=sum+fact(h);
         num=num/10;
       }
      int len=String.valueOf(sum).length();
      if(len==lol)
       System.out.println("Yes");
      else
        System.out.println("No");
	}
}