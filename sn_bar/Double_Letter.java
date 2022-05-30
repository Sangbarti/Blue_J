import java.io.*;
class Double_Letter
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String st="";
            int ln=0;
            char x=' ';
            char y=' ';
            char z=' ';
            int count=0;
            String s1="";
            //Variables are declared and initialised
            System.out.print("Accept a String/Sentence in Lowercase :");
            st= br.readLine();//Accept string
            st=st.toUpperCase();//Convert into uppercase()
            System.out.println("Uppercase :"+st);
            ln=st.length();//Find length
            for(int i=0;i<ln-1;i++)
            {
                x=st.charAt(i);
                y=st.charAt(i+1);//Extract character  
                if(x==y)//Checking character 
                {
                    count++;//Count number of same character
                    s1=s1+x+y+" ";//Store the same character
                }
            }
           
            System.out.println("Number of double letters :"+count);
            System.out.println("Double letters are :"+s1);
            
        }
    }
                
            
            
            