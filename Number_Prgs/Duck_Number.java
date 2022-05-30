class Duck_Number
    {
        public static void main(int n)
        {
            int rem=0;
            int flag=0;
            while(n>0)
            {
                rem=n%10;
                if(rem==0)
                {
                    flag=1;
                    break;
                }
                n=n/10;
            }
                if(flag==1)
                System.out.println("Duck Number");
                else
                System.out.println("Not Duck Number");
            
        }
    }