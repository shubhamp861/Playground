import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner u=new Scanner(System.in);
		int j=u.nextInt();
      int re=j/100;
      int y=j%10;
      System.out.println(y+re);
	}
}