import java.util.*;
class Words_Vertical_Vowels
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String/Sentence :");
            String st=sc.nextLine();
            st=st+" ";
            int ln=st.length();
            char x=' ';
            String s="";
            char xx=' ';
            int vw=0;
            System.out.println("Words Name"+"  "+"No.of Letters"+" "+"No.of Vowels");
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x!=' ')
                s=s+x;
                  else
                    {
                        for(int j=0;j<s.length();j++)
                        {
                            xx=s.charAt(j);
                            if(xx=='a'||xx=='e'||xx=='i'||xx=='o'||xx=='u'||xx=='A'|| xx=='E'|| xx=='I'||xx=='O'||xx=='U')
                            vw++;
                        }
                            System.out.println(s+"\t\t"+s.length()+"\t"+vw);
                            s="";
                            vw=0;
                    }
                }
        }
    }
                    