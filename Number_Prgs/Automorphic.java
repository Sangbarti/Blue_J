import java.io.*;
class Automorphic
{
 public static void main() throws IOException
 {
     InputStreamReader inp=new InputStreamReader (System.in);
     BufferedReader r=new BufferedReader (inp);
     int n, r1=0, d=0;
     double div=0, sq=0, r2=0;
     System.out.print(" Enter an Integer = ");
     n=Integer.parseInt (r.readLine());
     int temp=n;
     while(n>0)
       {
           
           n=n/10;
           d=d+1;
        }    
        sq=Math.pow(temp,2);
        div=Math.pow(10,d);
        r2=sq%div;
    
        if(r2==temp)
           System.out.println (" Automorphic ");
           else
           System.out.println (" Not Automorphic ");
        }
    }
     