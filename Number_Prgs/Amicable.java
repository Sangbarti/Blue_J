class Amicable//220 & 284
    {
        public static void main(int a,int b)
        {
            int sa=0,sb=0;
            for(int i=1;i<=a/2;i++)
            {
                if(a%i==0)
                sa=sa+i;
            }
            
            for(int j=1;j<=b/2;j++)
            {
                if(b%j==0)
                sb=sb+j;
            }
            if(a==sb && b==sa)
            System.out.println("Amicable Number");
            else
            System.out.println("Not Amicable Number");
        }
    }