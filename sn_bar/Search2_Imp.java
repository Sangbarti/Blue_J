import java.io.*;
class Search2_Imp
    {
       public static void array()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String country[]=new String[5];
            String capital[]=new String[5];
            String coun="";
            int flag=0;int pos=0;//Variables are declared and Initialised
            System.out.println("Enter 5 Country Name & their Capital Name below");
            for(int i=0;i<5;i++)
            {
                System.out.print("Country name :");
                country[i]=br.readLine();
                System.out.print("Capital name :");
                capital[i]=br.readLine();//Accepting Section
                System.out.println();
            }
            
            System.out.print("Enter the Country's Name to Search :");
            coun=br.readLine();//To accept country name
            
            for(int i=0;i<10;i++)
            {
                if(coun.compareToIgnoreCase(country[i])==0)//To check whether the country exists in array 
                {
                    flag=1;
                    pos=i;//To store the position
                    break;
                }
            }
            
            if(flag==1)
            System.out.println("Capital Name :"+capital[pos]);//To display Capital according to position
            else
            System.out.println("No Such Country Exits In The List");
        }
    }