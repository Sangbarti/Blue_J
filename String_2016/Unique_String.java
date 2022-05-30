import java.io.*;
class Unique_String
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String st="";
            int ln=0;
            char x=' ';
            int flag=0;
            int count=0;
            String s1="";
            
            System.out.print("Accept a String :");
            st= br.readLine();
            st=st.toUpperCase();
            System.out.println("Uppercase :"+st);
            ln=st.length();//Find length
            
            for(int j=65;j<=90;j++)
             {
                 count=0;
                 for(int i=0;i<ln;i++)
                 {
                     x=st.charAt(i);
                     if(x==(char)j)
                     count++;
                 }
                 if(count>1)
                 {
                     flag=1;
                     break;
                 }
             }
             if(flag==1)
             System.out.println("Not Unique String");
             else       
             System.out.println("Unique String");
            
        }
    }
                
            
            
            