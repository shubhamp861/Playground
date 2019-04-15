import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner m=new Scanner(System.in);
      int o=m.nextInt();
      int k=o%10;
      o=o/10;
      System.out.println(o+k);
	}
}