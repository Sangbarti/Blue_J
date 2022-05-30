class Krishnamurti//Special Number
    {
        public static void main(int n)
        {
            int i,r,f,s=0,copy=n;
            while(n!=0)
            {
                r=n%10;
                n=n/10;
                f=1;
                for(i=1;i<=r;i++)
                {
                    f=f*i;
                }
                s=s+f;
                
            }
            if(s==copy)
            System.out.println("Krishnamurti No");
            else
             System.out.println("Not Krishnamurti No");
            }
        }