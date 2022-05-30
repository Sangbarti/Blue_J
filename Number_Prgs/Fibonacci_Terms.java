// Fibonacci Series : 0,1,1,2,3,5,8,13,21,34,55,.............
class Fibonacci_Terms
    {
        public static void main(int n)
        {
            int a=0;
            int b=1;
            int c=0;
            for(int i=1;i<=n;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
        }
    }