import java.util.*; 
class longest_smallest_word
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a String :");
         String st=sc.nextLine();
         st=st+" ";
         int ln=st.length();
         char x=' ';
         int ln1=0;
         int max=0;
         int count=0;
         String s="";
         String wd="";
         int min=ln;
         String wd1="";
         
         
         for(int i=0;i<ln;i++)
         {
             
                x=st.charAt(i);
                if(x!=' ')
                {
                    s=s+x;
                }
                else
                  {                                                                                 
                     ln1=s.length();
                     if(ln1>max)
                     {
                      max=ln1;
                      wd=s;
                     }
                     if(ln1<min)
                     {
                         min=ln1;
                         wd1=s;
                     }
                      s="";
                      ln1=0;
                  }
            }
            System.out.println("The longest word : "+wd);
            System.out.println("The Length = "+max);
            System.out.println("The smallest word : "+wd1);
            System.out.println("The Length = "+min);
        }
    }
            
                
               
                    
            
            