//https://mycode.prepbytes.com/problems/fundamentals/RVSREUM
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int rem;
    while (n !=0)
    {
      rem= n%10;
      n=n/10;
      System.out.print(rem);
    }
  }
}