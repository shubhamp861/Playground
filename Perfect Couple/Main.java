import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      int g=sc.nextInt();
      int au[]=new int[g];
      for(int i=0;i<g;i++)
      {
        au[i]=sc.nextInt();
      }
      int val=sc.nextInt();
      for(int y=0;y<g-1;y++)
      {
        for(int u=y+1;u<g;u++)
        {  
          if((au[y]+au[u])==val)
          {
            System.out.println(au[y]+", "+au[u]);
          }
        }
      }

    }
}