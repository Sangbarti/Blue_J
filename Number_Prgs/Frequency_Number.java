class Frequency_Number//Occurrence of a Number
{
    public static void main(int n)
    {
        System.out.println("Number ="+n);
        int count=0,rem=0;
        int copy=n;
        for(int i=0;i<=9;i++)
        {
             count=0; 
            do
            {
                rem=n%10;
                if(rem==i)
                count++;
                n=n/10;
            }
            while(n>0);
             if(count!=0)   
             System.out.println("Frequency of "+i+" is "+count);
             n=copy;
                                  
            }
    
        }
    }
