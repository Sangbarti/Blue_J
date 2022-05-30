class Fibonacci__Check
    {
        public static void main(int num)
        {
            int a=1;
            int b=2;
            int c=0;
            int flag=0;
            System.out.print("Fibo Series --->");
            for(int i=1;a<=num;i++)
            {
                System.out.print(a+",");
              if(num==a)
              {
                  flag=1;
                  break;
              }
              c=a+b;
              a=b;
              b=c;
            }
            System.out.println();
            if(flag==1)
            System.out.println("Number "+num+" is in fibonacci series");
            else
            System.out.println("Number "+num+" is not in fibonacci series");
        }
    }
            
       
            
     