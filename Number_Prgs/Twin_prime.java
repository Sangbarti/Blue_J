class Twin_prime
    {
    public static void main(int a,int b)
    {
        if(((a-b)==2)||((b-a)==2))
        {
        int c1=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c1=c1+1;
        }
        int c2=0;
        for(int j=1;j<=b;j++)
          {
              if(b%j==0)
              c2=c2+1;
            }
            if((c1==2)&&(c2==2))
            System.out.println("The numbers  are Twin prime");
            else
            System.out.println("The numbers  are not Twin prime");
        }
        System.out.println("The numbers  are not Twin prime");
    }
}
            