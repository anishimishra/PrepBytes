//https://mycode.prepbytes.com/problems/fundamentals/LUCKNUM
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=n,c1=0,c2=0,i;
    while(m>0)
    {
      if(m%7!=0)
      {
        m=m-4;
        c1++;
      }
      if(m%7==0)
      {
        m=m-7;
        c2++;
      }
    }
    if(m<0)
      System.out.println(-1);
    else
    {
      for(i=0;i<c1;i++)
        System.out.print(4);
      for(i=0;i<c2;i++)
        System.out.print(7);
      System.out.println();
    }
  }
}