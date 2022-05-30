import java.io.*;
class Palin_Words
{
        public static void main()throws IOException
        {
           InputStreamReader inp=new InputStreamReader(System.in);
           BufferedReader br=new BufferedReader(inp);
           String st="";
           System.out.print("Enter a String/Sentence : ");
           st=br.readLine();//Accept a sentence  
           st=st+" ";
           int ln=st.length();//Find length
           char x=' ';
           String s="";
           String s1="";//Variables are declared and initialised
           for (int i=0;i<ln;i++)
           {
               x=st.charAt(i);//Extract character
               if(x!=' ')
               s=s+x;//Store character in a string
               else
                {
                    for(int j=s.length()-1;j>=0;j--)
                    {
                        char y=s.charAt(j);
                        s1=s1+y;//Store character in reverse order
                    }
                
                    if(s1.equalsIgnoreCase(s)==true)//Checking two strings
                    System.out.println(s);//Display palindrome words
                    s="";
                    s1="";
                }
            }
        }
    }
 
                