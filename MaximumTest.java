import java.io.*;
import java.util.*;

public class MaximumTest
{
   public static<T extends Comparable<T>> T maximum(T x, T y, T z)
   {
     T max = x;
     if(y.compareTo(max)>0)
     {
         max=y;
     }
     if(z.compareTo(max)>0)
     {
         max=z;
     }
     return max;
   }
  public static void main(String args[])
 {
      int a,b,c;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter 3 numbers");
      
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
  
   System.out.println("Maximum value is" +maximum(a,b,c));
   System.out.println("Maximum value is" +maximum(6.6,8.8,7.7));
   System.out.println("Maximum " + maximum("pear","apple","orange"));
 }
}


