class Initials_2Words//Partha Chakraborty => P.Chakraborty
    {
        public static void main(String st)
        {
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
                    s=s+st.substring((i+1),ln);
                }
             }
            System.out.println(s);
        }
    }

