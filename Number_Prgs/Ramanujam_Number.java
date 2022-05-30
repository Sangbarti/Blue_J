class Ramanujam_Number//
    {
        public static void main(int n)
        {
           int rem=0;
           int rev=0;
           int copy=n;
           int prod=0;
           while(n>0)
           {
               rem=n%10;
               rev=rev*10+rem;
               n=n/10;
            }
            prod=copy*rev;
            
           int s=0;
           while(prod>0)
           {
               rem=prod%10;
               s=s+rem;
               prod=prod/10;
            }
            if(s==copy)
            
            System.out.println("Ramanujam number");
            else
            System.out.println("Not Ramanujam number");
        }
    }