class Word_Occurrence2007
    {
        public static void main(String st,String wd)
        {
            System.out.println(st);
            st=st+" ";
            int ln=st.length();
            char x=' ';
            String s="";
            int count=0;
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x!=' ')
                {
                    s=s+x;
                }
                else
                {
                    if(wd.equals(s)==true)
                    count++;
                    s="";
                }
             }
             System.out.println("Frequency of Word "+wd+" = "+count);
        }
    }