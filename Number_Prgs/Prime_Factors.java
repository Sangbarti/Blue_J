class Prime_Factors
    {
        public static void main(int n)
        {
            int c=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c=0;
                    for(int j=1;j<=i;j++)
                    {
                        if(i%j==0)
                        c=c+1;
                    }
                    if(c==2)
                    System.out.println(i);
                }
             
                                
                }
            }
        }
