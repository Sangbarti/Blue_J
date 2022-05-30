class Armstrong_series
    {
        public static void main()
            {
                int sum=0;
                int rem=0;
                int temp;
                for(int i=100;i<=1000;i++)
                {
                    sum=0;
                    rem=0;
                    temp=i;
                    while(temp!=0)
                    {
                        rem=temp%10;
                        sum=sum+(rem*rem*rem);
                        temp=temp/10;
                    }
                        if(sum==i)
                        System.out.println(i);
                      
                }
            }
      }
      
            