import java.util.*;
class Twisted_Prime
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a Number :");
            int n=sc.nextInt();
            int c=0;
            int temp=n;
            int rev=0,rem=0;
            int d=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                c++;
            }
            while(n>0)
            {
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            for(int j=1;j<=rev;j++)
            {
                if(rev%j==0)
                d++;
            }
            if(c==2 && d==2)
            System.out.println("Twisted Prime");
            else
            System.out.println("Not Twisted Prime");
        }
    }
            