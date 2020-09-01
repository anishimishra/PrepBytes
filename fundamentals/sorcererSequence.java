//https://mycode.prepbytes.com/problems/fundamentals/JUGGLER
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();          
    while (t-->0)
    {
      int n=sc.nextInt();
      System.out.print(n+ " ");
      long l=n;
      long m;
      while(l!=1)
      {
        m=0;
        if (l%2==0)
        {
          m=(long)Math.sqrt(l);
        }
        else 
        {
          m=(long)(Math.sqrt(l)*Math.sqrt(l)*Math.sqrt(l));
          
        }
        l=m;
        System.out.print(m+ " ");
      }
      System.out.println();
    }
  }
}