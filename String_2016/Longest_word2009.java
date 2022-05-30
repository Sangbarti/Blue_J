class Longest_word2009
 {
     public static void main(String st)
     {
         System.out.println(st);
         st=st+" ";
         int ln=st.length();
         char x=' ';
         int le=0;
         int max=0;
         int count=0;
         String ss="";
         String s="";
         for(int i=0;i<ln;i++)
         {
                x=st.charAt(i);
                if(x!=' ')
                {
                    s=s+x;
                }
                else
                  {                                                                                 
                     le=s.length();
                     if(le>max)
                     {
                        max=le;
                        ss=s;
                     }
                      s="";
                  }
            }
            System.out.println("The longest word is="+ss);
            System.out.println("The Length  is" +" "+max);
        }
    }
            
