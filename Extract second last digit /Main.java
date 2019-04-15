import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
        int g=in.nextInt();
        g =g/10;
       int h=g%10;
      System.out.println(h);
	}
}