class Initials_3Words_title1//Partha Sarathi Chakraborty => Chakraborty P.S.
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
                    s=s+st.charAt(i+1)+".";
                    if(spc==3)
                    s=st.substring((i+1),ln)+" "+s;
                }
             }
            System.out.println(s);
        }
    }

