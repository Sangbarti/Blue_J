class Republic2006
    {
        public static void main()
        {
            String st="26th January is celebrated as Republic day in India";
            System.out.println(st);
            st=st+" ";
            int ln=st.length();
            char x=' ';
            String s="";
            String st1="";
            
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x!=' ')
                s=s+x;
                else
                {
                    if(s.equals("26th"))
                    st1=st1+" "+"15th";
                    else
                    if(s.equals("January"))
                    st1=st1+" "+"August";
                    else
                    if(s.equals("Republic"))
                    st1=st1+" "+"Independence";
                    else
                    st1=st1+" "+s;
                    s="";
                }
            }
            System.out.println(st1.trim());
        }
    }
                