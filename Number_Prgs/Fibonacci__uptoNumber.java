class Fibonacci__uptoNumber
    {
        public static void main(int num)
        {
            int a=0;
            int b=1;
            int c=0;
            for(int i=1;a<=num;i++)
            {
              System.out.println(a);
              c=a+b;
              a=b;
              b=c;
            }
        }
    }
            
       
            
     