import java.io.*;
class Income_Tax
    {
        public static void main()throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            int age=0;
            int inc=0;
            char gen=' ';
            double tax=0.0;//Variables are declared & initialised.
            System.out.print("Enter Age :");
            age=Integer.parseInt(br.readLine());//Accept Age
            System.out.print("Enter Gender M for Male Or F for Female :");
            gen=br.readLine().charAt(0);//Accept Gender
            System.out.print("Enter Taxable Income :");
            inc=Integer.parseInt(br.readLine());//Accept Income
            if(age<=65 && gen=='M')//Condition check

            {
                if(inc<=160000)
                tax=0;
                else
                if(inc>160000 && tax<=500000)//Condition check
                tax=(inc-160000)*0.10;//Calculate tax
                else
                if(inc>500000 && inc<=800000)//Condition check
                tax=(inc-500000)*0.20+34000;//Calculate tax
                else
                if(inc>800000)
                tax=(inc-800000)*0.30+94000;//Calculate tax
                System.out.println("Taxable Income ="+inc);
                System.out.println("Income Tax ="+tax);//Display Section
            }
            else
                System.out.println("Wrong Category , No Calculation of Income Tax possible");
            }
        }
                
            