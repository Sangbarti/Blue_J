public class Ramanujan_no
{
    public static void main(int m)
    {
        int s=0,d=0,n=m,r=0,f=0,g=0;
        while(n>0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        g=s;
        while(s>0)
        {
            f=s%10;
            r=r*10+f;
            s=s/10;
        }
        if(g*r==m)
        {
            System.out.println(m + " is a ramanujan no ");
        }
        else
        {
            System.out.println(m + " is not a ramanujan no ");
        }
    }
}

