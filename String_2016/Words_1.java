class Words_1//computer is fun   ----  retupmoc si nuf

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
                    s=x+s;
                }
                else
                {
                    ss=ss+" "+s;
                    s="";
                }
            }
            System.out.println(ss.trim());
        }
    }
