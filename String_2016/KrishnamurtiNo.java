import java.io.*;
class KrishnamurtiNo
{
 public static void main(int n)
 {
    System.out.println("Enter a number="+n);
    int n1=n,r,s=0;
    
    while(n>0)
    {
     int f=1;   
     r=n%10;
     n=n/10;
     for(int i=r; i>=1; i--)
     {
        f=f*i;
      }
     s=s+f;   
    }
    System.out.println("S="+s);
    if(s==n1)
        System.out.println("Krishnamurti no.");
    else
        System.out.println("Not a Krishnamurti no."); 
    }
}
