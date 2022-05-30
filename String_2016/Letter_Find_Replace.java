class Letter_Find_Replace
    {
        public static void main(String st,char lett_find,char lett_repl)
        {
            System.out.println("Old Word :"+st);
            int ln=st.length();
            char x=' ';
            String ss="";
            for(int i=0;i<ln;i++)
                {
                    x=st.charAt(i);
                    if(x==lett_find || x==(char)(lett_find+32)||x==(char)(lett_find-32))
                    ss=ss+lett_repl;
                    else
                    ss=ss+x;
                }
                System.out.println("New Word :"+ss);
          }
    }
   
