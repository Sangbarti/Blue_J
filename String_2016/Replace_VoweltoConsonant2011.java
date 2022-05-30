import java.util.*;
class Replace_VoweltoConsonant2011
    {
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String :");
            String st = sc.nextLine();
            int ln = st.length();
            char x=' ';
            String s="";
            int y=0;
            char z=' ';
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x=='a' ||x=='e'||x=='i' ||x=='o'||x=='u' ||x=='A'||x=='E' ||x=='I'||x=='O' ||x=='U')
                {
                    y=(int)x+1;
                    z=(char)y;
                    s=s+z;
                }
                else
                s=s+x;
            }
            System.out.println(s);
        }
    }