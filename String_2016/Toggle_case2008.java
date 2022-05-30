import java.util.*;
class Toggle_case2008
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String :");
            String st=sc.nextLine();
            int ln=st.length();
            char x=' ';
            String s="";
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x!=' ')
                {
                    if(x>='A' && x<='Z')//Capital to Small
                    {
                        int xx=(int)x;
                        int yy=xx+32;
                        char z=(char)yy;
                        s=s+z;
                    }
                    else
                    if(x>='a' && x<='z')//Small to Capital
                    {
                        int xx1=(int)x;
                        int yy1=xx1-32;
                        char z1=(char)yy1;
                        s=s+z1;
                    }
                }
                else
                s=s+x;
            }
            System.out.println(s);
        }
    }