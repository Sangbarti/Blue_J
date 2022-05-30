import java.io.*;
class FruitJuice
    {
        int product_code;
        int pack_size;
        int product_price;
        String flavour;
        String pack_type;//Variables are declared
        public FruitJuice()
        {
            product_code=0;
            pack_size=0;
            product_price=0;
            flavour="";
            pack_type="";//Variables are initialised
        }
        public void input() throws IOException
        {
            InputStreamReader inp=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(inp);
            System.out.print("Enter the Product code :");
            product_code=Integer.parseInt(br.readLine());//Accept Productcode
            System.out.print("Enter the Pack size :");
            pack_size=Integer.parseInt(br.readLine());//Accept Packsize
            System.out.print("Enter the Flavour :");
            flavour=br.readLine();//Accept Flavour
            System.out.print("Enter the Pack type :");
            pack_type=br.readLine();//Accept Packtype
            System.out.print("Enter the Product Price :");
            product_price=Integer.parseInt(br.readLine());//Accept Product Price
        }
        public void discount()
        {
            product_price=product_price-10;//Calculate Price after Discount
        }
        public void display()
        {
            System.out.println("Product Code :"+product_code);
            System.out.println("Pack Size :"+pack_size);
            System.out.println("Flavour :"+flavour);
            System.out.println("Pack Type :"+pack_type);
            System.out.println("Product Price :"+product_price);//Display Section
        }
        public static void main()throws IOException
        {
            FruitJuice obj=new FruitJuice();//Object Creation
            obj.input();
            obj.discount();
            obj.display();//Calling the methods
        }
    }
            
