//https://mycode.prepbytes.com/problems/fundamentals/TOPPER
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int n=sc.nextInt();
      int i,s;
      System.out.print(a + " " + b + " " + c + " ");
      for(i=3;i<=n-1;i++)
      {
        s=a+b+c;
        a=b;
        b=c;
        c=s;
        System.out.print(s+ " ");
      }
      System.out.println();
    }
  }
}