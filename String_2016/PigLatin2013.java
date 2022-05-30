import java.io.*;
class PigLatin2013
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String st="";
            //Variable are declared & initialised
           System.out.print("Enter a String/Word : ");
           st=br.readLine();//Accept a word
           int ln=st.length();//Find length
           char xx=' ';String ss1="";
           String ss2="";
           int pos=0;//Variables are declared and initialised
             for (int i=0;i<ln;i++)
             {
                 xx=st.charAt(i);//Extract character
                 if(xx=='a'||xx=='e'||xx=='i'||xx=='o'||xx=='u'||xx=='A'|| xx=='E'|| xx=='I'||xx=='O'||xx=='U')
                 {                                         //Checking for Vowels
                     pos=i;//Store position
                     break;
                 }
             }
                ss1=st.substring(pos,ln);
                ss2=st.substring(0,pos);
                System.out.print(ss1+ss2+"ay");//Display piglatin word
        }
    }

                