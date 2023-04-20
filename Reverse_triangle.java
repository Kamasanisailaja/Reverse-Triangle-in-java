//Reverse trianle pattern

import java.util.Scanner;
  class Reverse_triangle
  {
    public static void main(String[] args)
    {
       int i,j,s,n;
       Scanner in = new Scanner(System.in);
       System.out.println("enter the value of n:");
       n=in.nextInt();
      for(i=n;i>=1;i--)
      {
        for(s=1;s<=n-i;s++)
        {
          System.out.print(" ");
        }
      for(j=1;j<=(2*i-1);j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    }
  }
