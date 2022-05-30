class Perfect_No_Series
    {
        public static void main()
        {
            int i,j;
            int sum=0;
            for(j=1;j<=1000;j++)
            {
                sum=0;
                for(i=1;i<j;i++)
                {
                    if(j%i==0)
                    sum=sum+i;
                }
                if(sum==j)
                            
            System.out.println(j);
           
             }
       }
    }
        