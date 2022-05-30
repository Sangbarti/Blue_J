class pale_series // 0 1 2 5 12 29 --- n terms
{
    public static void main(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=n;i++)
        {
            c=a+b*2;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
            
                