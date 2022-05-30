import java.util.*;
class Selection_Sort_Descending
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int n[]=new int[10];
            int temp,pos;
            int max;
            System.out.println("Enter 10 Numbers");
            for(int i=0;i<10;i++)
            {
                n[i]=sc.nextInt();
            }
            
            for(int i=0;i<10;i++)
            {
                max=n[i];
                pos=i;
                for(int j=i+1;j<10;j++)
                {
                    if(n[j]>max)
                    {
                        max=n[j];
                        pos=j;
                    }
                }
                    temp=n[i];
                    n[i]=n[pos];
                    n[pos]=temp;
            }
               
            System.out.println("Array in Sorted Order");
            for(int i=0;i<10;i++)
            {
                System.out.println(n[i]);
            }
        }
    }