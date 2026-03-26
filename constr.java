
//THE Parameterized constructer.......  it is deferent from the default constructor;........ not that much !

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
    public toothpaste(int p, String b)
    {
        price = p;
        brand = b;
        
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


    // public toothpaste(int price, String brand) {         // this constructor is created by the IDE shortcut 
    //     this.price = price;
    //     this.brand = brand;
    // }
    // public toothpaste() {
    // }



    
}





public class constr {
    public static void main(String []a)
    {
        toothpaste tp = new toothpaste( 58 , "patanjali");
        toothpaste tp1 =new toothpaste();

        System.out.println(tp.getprice() + " : " + tp.getbrand() );
         tp.setprice( 98) ;
         tp.setbrand("dantkanti");

         System.out.println(tp.getprice() + " : " + tp1.getbrand() );

        System.out.println(tp1.getprice() + " : " + tp1.getbrand() );
    }    
}
