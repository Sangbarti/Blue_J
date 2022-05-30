import java.io.*;
class Prime_Palindrome_series
    {
        public static void main() throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            
            int count=0;
            int rem=0;
            int rev=0;
            int copy;
            
            for(int j=10;j<=1000;j++)
            {
              copy=j;rem=0;rev=0; 
              count=0;
              for(int i=1;i<=j;i++)
              {
                if(j%i==0)
                count++;
               }
               if(count==2)
                {
                    while(copy>0)
                    {
                        rem=copy%10;
                        rev=rev*10+rem;
                        copy=copy/10;
                    }
                }
               if(rev==j)
               System.out.println(j);
            }
    }
}