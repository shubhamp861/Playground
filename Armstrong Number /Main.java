import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();int lol=num;
       int sum=0;
       while(num>0)
       {
         int g=num%10;
         sum=sum+(g*g*g);
          num=num/10;
       }
      if(lol==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
      
	}
}