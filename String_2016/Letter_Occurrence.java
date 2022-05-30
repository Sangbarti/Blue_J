class Letter_Occurrence
    {
        public static void main(String st,char letter)
        {
            System.out.println("Word :"+st);
            int ln=st.length();
            char x=' ';
            int count=0;
            for(int i=0;i<ln;i++)
                {
                    x=st.charAt(i);
                    if(x==letter || x==(char)(letter+32)||x==(char)(letter-32))
                    count++;
                }
                System.out.println(letter+"=="+count);
          }
    }
   
