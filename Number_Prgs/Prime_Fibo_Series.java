class Prime_Fibo_Series
    {
        public static void main(int n)
        {
            int a=1;
            int b=2;
            int c=0;
            int count=0;
            for(int i=1;i<=n;i++)
            {
                count=0;
                for(int j=1;j<=a;j++)
                {
                    if(a%j==0)
                    count++;
                }
                if(count==2)
                
                    System.out.println(a);
                    c=a+b;
                    a=b;
                    b=c;
                
            }
        }
    }
                
                