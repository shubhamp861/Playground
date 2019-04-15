import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
       
       
        if(h>=85){System.out.println("A");}
        if(h<85&&h>=75){System.out.println("B");}
        if(h<75&&h>=65){System.out.println("C");}
        if(h<65&&h>=55){System.out.println("D");}
        if(h<55&&h>=45){System.out.println("E");}
        if(h<45){System.out.println("Fail");}
        
    }
}