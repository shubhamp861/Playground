import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int i, j, k;
for(i=1;i<=n;i++)
{
for(j=i;j<n;j++)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}

	}
}