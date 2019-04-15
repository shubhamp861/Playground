import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();int h=1;
      for(int i=0;i<num;i++){
        System.out.println(h);
        h=h+2;
      }
	}
}