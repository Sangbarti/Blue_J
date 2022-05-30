class PrimePalin_Check
{
   public static void main(int n)
   {
        int d,c,i,r=0,p=0,k=0;
            p=n;
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
                System.out.println("Number is Prime Palin");
                else
                System.out.println("Number is Not Prime Palin");
           }
           else
           System.out.println("Number is Not Prime Palin");
            
        }
    }
