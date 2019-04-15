import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int h=sc.nextInt();
       int dun=0;
      for(int y=h;y>0;y--)
      {
        dun=dun+y;
      }
      System.out.println(dun);
	}
}