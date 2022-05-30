class Happy_Ayan
    {
        public static void main(int n)
        {
            int rem;
            int sum;
            sum=n;
                 while(n>0)
                {
                    sum=0;
                    while(n>0)
                    {
                    rem=n%10;
                    sum=sum+rem*rem;
                    n=n/10;
                    }
                    if(sum>9)
                    n=sum;
                    else
                    break;
                 }
                 
                if(sum==1)
                System.out.println("Happy");
                else
                System.out.println("Not Happy");
            }
        }

     