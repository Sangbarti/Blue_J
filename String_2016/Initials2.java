class Initials2//Partha Sarathi Chakraborty => PSC
    {
        public static void main(String st)
        {
            st=" "+st;
            int ln=st.length();
            char x=' ';
            String s="";
            for(int i=0;i<ln;i++)
            {
                x=st.charAt(i);
                if(x==' ')
                s=s+st.charAt(i+1);
            }
            System.out.println(s);
        }
    }
                
                
                
        
        