class hcf_lcm
    {
        public static void main(int x,int y)
        {
            int hcf=0;
            int lcm=0;
            int prod=0;
            prod=hcf*lcm;
            for(int i=1;i<=prod;i++)
            {
                if(x%i==0 && y%i==0)
                {
                    hcf=i;
                }
            }
            lcm=prod/hcf;
            System.out.println(hcf);
            System.out.println(lcm);
        }
    }