class Abphabetical_Order
    {
        public static void main(String st)
        {
            System.out.println(st);
            int ln=st.length();
            char x=' ';
            String s="";
            for(int j=65;j<=90;j++)
            {
                for(int i=0;i<ln;i++)
                {
                    x=st.charAt(i);
                    if(x==(char)j || x==(char)(j+32))
                    s=s+x;
                }
            }
            System.out.println(s);
        }
    }