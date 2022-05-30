import java.util.*;
class Initials_3Words // Subhash Chandra Bose --> Bose,S.C.
    {
        public static void main() 
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String :");
            String st=sc.nextLine();
            st=" "+st;
            int ln=st.length();
            char x=' ';
            String s="";
            int spc=0;
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x==' ')
                {
                    spc++;
                    if(spc==1)
                    s=s+st.charAt(i+1)+".";
                    if(spc==2)
                    s=s+st.charAt(i+1)+".";
                    if(spc==3)
                    s=st.substring((i+1),ln)+","+s;
                }
             }
            System.out.println(s);
        }
    }


                
                
                
        
        