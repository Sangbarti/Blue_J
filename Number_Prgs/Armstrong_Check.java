class Armstrong_Check//153,307
    {
        public static void main(int n)
            {
                int sum=0,rem=0;
                int b=n;
                {
                    while(n!=0)
                    {
                        rem=n%10;
                        sum=sum+(rem*rem*rem);
                        n=n/10;
                    }
                        if(sum==b)
                        System.out.println("Armstrong");
                        else
                        System.out.println("Not Armstrong");
                }
            }
      }