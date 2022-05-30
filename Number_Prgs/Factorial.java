class Factorial
    {
        public static void main(int n)
        {
            int f=1;
            for(int i=n;i>=1;i--)
            {
                f=f*i;
            }
            System.out.println("Factorial = "+f);
        }
    }