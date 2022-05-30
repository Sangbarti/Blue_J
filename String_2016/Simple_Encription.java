import java.io.*;
class Simple_Encription
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String st="";
            int ln=0;
            char x=' ';
            char y=' ';
            int a=0,b=0;
            String s1="";
            System.out.print("Accept a String :");
            st= br.readLine();
            ln=st.length();
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                a=(int)x;
                b=a+1;
                y=(char)b;
                s1=s1+y;
            }
            System.out.println("New String :"+s1);
               
        }
    }
                
            
            
            