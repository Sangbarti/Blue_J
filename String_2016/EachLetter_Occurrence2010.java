class EachLetter_Occurrence2010
    {
        public static void main(String st)
        {
            System.out.println("Word :"+st);
            int ln=st.length();
            char x=' ';
            String s="";
            int count=0;
            for(int j=65;j<=90;j++)
            {
                count=0;
                for(int i=0;i<ln;i++)
                {
                    x=st.charAt(i);
                    if(x==(char)j || x==(char)(j+32))
                    count++;
                }
                if(count>0)
                System.out.println((char)j+"=="+count);
            }
            
        }
    }
