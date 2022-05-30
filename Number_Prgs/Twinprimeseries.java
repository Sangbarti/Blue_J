class Twinprimeseries
{
     public static void main(int n)
        {
            int i,j,k;
            int c1=0;
            int c2=0;
            for(i=1;i<=n;i++)
            {
              for(j=1;j<=i;j++)
              {
                if(i%j==0)
                c1++;
              }
            for(k=1;k<=(i+2);k++)
            {
                if((i+2)%k==0)
                c2++;
            }
            if(c1==2 && c2==2)
            System.out.println(i+" , "+(i+2));
            c1=0;c2=0;
        }
    }
}
            
