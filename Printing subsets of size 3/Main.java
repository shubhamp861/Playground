import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner (System.in);
      int siz=sc.nextInt();
      int gi[]=new int[siz];
      for(int j=0;j<siz;j++)
      {
        gi[j]=sc.nextInt();
      }
      for(int i=0;i<siz-1;i++)
      {
        for(int i2=i+1;i2<siz;i2++)
        {
          for(int i3=i2+1;i3<siz;i3++)
          { System.out.print("("+gi[i]+", "+gi[i2]+", "+gi[i3]+")"+" ");}
         
        }
         System.out.println();
      }
    }
}