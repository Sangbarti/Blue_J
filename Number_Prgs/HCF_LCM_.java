class HCF_LCM_
    {
        public static void main(int a, int b)
        {
            int p=a*b;
            int c=0;
            while(a!=b)
            {
                if(a>b)
                a=a-b;
                else
                b=b-a;
            }
            System.out.println("HCF="+a);
            c=p/a;
            System.out.println("LCM="+c);
        }
    }