import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int k1=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k1++ + " ");
            }
            System.out.println("");
        }
    }    
}