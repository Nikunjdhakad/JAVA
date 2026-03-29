class toothpaste
{
   
    private int price;
    private String brand ;       
    
    
     public toothpaste()        // it is a default constructor.
    {
    //    price = 19;
    //    brand = "newest";
    System.out.println("jai shree ram" );
    }
    
                              
    public void setprice(int p)
    {
        price = p;
    }


    public int getprice()                     
    {                                         
        return price;
    }

    public void setbrand( String b)
    {
        brand=b;
    }

    public String getbrand()
    {
        return brand;
    }
}





public class constructor {
    public static void main(String []a)
    {
        toothpaste tp = new toothpaste();
        toothpaste tp1 =new toothpaste();

        System.out.println(tp.getprice() + " : " + tp.getbrand() );
         tp.setprice( 98) ;
         tp.setbrand("dantkanti");

        System.out.println(tp1.getprice() + " : " + tp1.getbrand() );
    }    
}
