class Words_2//computer is fun     ----    fun is computer

    {
        public static void main()
        {
            String st="computer is fun";
            System.out.println(st);
            st=st+" ";
            int ln=st.length();
            char x=' ';
            String s="";
            String ss="";
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x!=' ')
                {
                    s=s+x;
                }
                else
                {
                    ss=s+" "+ss;
                    s="";
                }
            }
            System.out.println(ss.trim());
        }
    }
           
