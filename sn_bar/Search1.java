import java.io.*;
class Search1
    {
       public static void array()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            String country[]={"India","Sri Lanka","Pakistan","Afganistan","Bangladesh","Nepal","Bhutan","Iraq","China","Japan"};
            String capital[]={"Delhi","Colombo","Islamabad","Kabul","Dhaka","Kathmandu","Thimpu","Baghdad","Bejing","Tokyo"};
            String coun="";
            int flag=0;int pos=0;//Variables are declared and Initialised
            
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