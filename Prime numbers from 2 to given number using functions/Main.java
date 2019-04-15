import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int h=sc.nextInt();
      for(int i=2;i<h;i++)
      { int g=0,m=0;
        for(int y=2;y<h;y++)
        {
          g=i%y;
          if(g==0)
            m++;
        } 
       if(m==1)
        System.out.println(i);
      }
	}
}