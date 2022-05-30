import java.io.*;
class Complex_Encription1
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String st="";
            int ln=0;
            System.out.print("Accept a String :");
            st= br.readLine();
            ln=st.length();
            char x=' ';
            String ss="";
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x>='a' && x<='y')
                {
                    int aa=(int)x;
                    int bb=aa+1;
                    char yy=(char)bb;
                    ss=ss+yy;
                }
                else
                if(x>='A' && x<='Y')
                {
                    int aa1=(int)x;
                    int bb1=aa1+1;
                    char yy1=(char)bb1;
                    ss=ss+yy1;
                }
              if(x=='z')
              ss=ss+'a';
              else
              if(x=='Z')
              ss=ss+'A';
          }
            System.out.println("New String :"+ss);
               
        }
    }
                
            
            
            