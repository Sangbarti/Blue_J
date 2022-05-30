class Weakarm
    {
        public static void main(int n)
        {
            int copy=n,s=0;
            int temp=n;
            int rem=0;
            int count=0;
            while(copy>0)
             {
                 count++;
                 copy=copy/10;
             }
              
            while(n>0)
            {
                rem=n%10;
                s=s+(int)Math.pow(rem,count);
                count--;
                n=n/10;
            }
                if(temp==s)
                System.out.println(temp+" is Weakarm Number");
                else
                System.out.println(temp+" is Not Weakarm Number");
               
         }
        }