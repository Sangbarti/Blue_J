class Word_Find_Replace
    {
        public static void main(String st,String wd_find,String wd_repl)
        {
            System.out.println("Old String :"+st);
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
                    if(wd_find.equals(s)==true)
                    ss=ss+" "+wd_repl;
                    else
                    ss=ss+" "+s;
                    s="";
                }
             }
             System.out.println("New String :"+ss);
        }
    }