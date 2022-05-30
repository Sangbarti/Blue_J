import java.util.*;
class Reverse_Palindrome
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String :");
            String st=sc.next();
            int ln=st.length();
            char x=' ';
            String s="";
            
            for(int i=ln-1;i>=0;i--)
            {
                x=st.charAt(i);
                s=s+x;
            }
            System.out.println("Reverse :"+s);
            if(s.equalsIgnoreCase(st)==true)//if(s.compareTo(st)==0)
            System.out.println("Palindrome");
            else
            System.out.println("Not Palindrome");
        }
    }
                