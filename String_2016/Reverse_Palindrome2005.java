import java.util.*;
class Reverse_Palindrome2005
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String :");
            String st=sc.next();
            int ln=st.length();
            char x=' ';
            String s="";
            char xx=' ';
            int vw=0;
            for(int i=ln-1;i>=0;i--)
            {
                x=st.charAt(i);
                s=s+x;
            }
            for(int j=0;j<ln;j++)
            {
              xx=st.charAt(j);  
              if(xx=='a'||xx=='e'||xx=='i'||xx=='o'||xx=='u'||xx=='A'|| xx=='E'|| xx=='I'||xx=='O'||xx=='U')
              vw++;
            }
            System.out.println("Number of Vowels="+vw);
            System.out.println("Reverse :"+s);
            if(s.equalsIgnoreCase(st)==true)//if(s.compareTo(st)==0)
            System.out.println("Palindrome");
            else
            System.out.println("Not Palindrome");
        }
    }
                