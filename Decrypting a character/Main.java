import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
  Scanner reader = new Scanner(System.in);
char c = reader.next().trim().charAt(0);
      switch(c)
      {
        case 'T':
          System.out.println("R");
          break;
        case 'c':
          System.out.println("z");
      }
    }
}