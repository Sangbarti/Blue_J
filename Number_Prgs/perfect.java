class perfect
    {
        public static void main(int n)
        {
            int i,j,c=0;int sum=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            if(sum==n)
            System.out.println("Perfect no");
            else
            System.out.println("Not Perfect no");
        }
        }