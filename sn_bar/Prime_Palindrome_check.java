import java.io.*;
class Prime_Palindrome_check
    {
        public static void main() throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            System.out.print("Enter a Number :");
            int n=Integer.parseInt(br.readLine());
            int count=0;
            int rem=0;
            int rev=0;
            int copy=n;
            
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
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
            
            if(rev==n)
            System.out.println("Number is Prime as well as Palindrome");
            else
            System.out.println("Number is Not Prime-Palindrome");
        }
    }