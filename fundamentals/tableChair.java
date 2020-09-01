//https://mycode.prepbytes.com/problems/fundamentals/TABLECHAIR
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      long m=sc.nextLong();
      long r1=sc.nextLong();
      long r2=sc.nextLong();
      long r3=sc.nextLong();
      if(m%4==0)
      System.out.println("0");
      else if(m%4==1)
      System.out.println(Math.min(r3,Math.min(r1+r2,r1+r1+r1)));
      else if(m%4==2)
      System.out.println(Math.min(r2,Math.min(r1+r1,r3+r3)));
      else if(m%4==3)
      System.out.println(Math.min(r1,Math.min(r2+r3,r3+r3+r3)));
    }
  }
}