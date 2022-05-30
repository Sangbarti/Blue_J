class Palindrome
    {
        public static void main(int num)
        {
            int rev=0;
            int rem=0;
            int store=num;
            while(num>0)
            {   
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
                if(store==rev)
                System.out.println("Palindrome");
                else
                System.out.println("Not Palindrome");
        }
    }