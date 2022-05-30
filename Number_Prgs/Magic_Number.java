class Magic_Number
    {
        public static void main(int n)
        {
            int rem;
            int sum;
           sum=n;
                 while(sum>9)
                {
                    n=sum;
                    sum=0;
                    while(n>0)
                    {
                    rem=n%10;
                    sum=sum+rem;
                    n=n/10;
                    }
                 }
                 
                if(sum==1)
                System.out.println("Magic");
                else
                System.out.println("Not Magic");
            }
        }

     