class PrimePalin_Series
{
   public static void main()
   {
        int d,c,i,r=0,p=0,k=0,n=0;
        for(c=10;c<10000;c++)
        {
            n=c;
            r=0;
            p=c;
            do
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
           while(n!=0);
           if(r==p)
           {
               for(i=1;i<=p;i++)
               {
                   if(p%i==0)
                   k++;
                }
                if(k==2)
           
               System.out.print(p+", ");
               k=0;
            }
            
        }
    }
}