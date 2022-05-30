class UniqueNumber
    {
        public static void main(int n)
        {
            int rem=0,count=0,k=0;
            int temp=n;
            for(int i=0;i<=9;i++)
            {
                count=0;
                while(n>0)
                {
                    rem=n%10;
                    if(rem==i)
                    count++;
                    n=n/10;
                }
                   if(count>1)
                   {
                       k=1;
                       break;
                   }
                   n=temp;
            }
            
                if(k==1)
                System.out.println("Not Unique Number");
                else
                System.out.println("Unique Number");
        }
    }