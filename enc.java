

      /////////// only accesing the values...........//////////////



// class toothpaste
// {
//     private int price = 75;
//     private String brand = "colgate";         //  |
//                                               //  |
//     public int getprice()                     // \_/
//     {                                         // \_/
//         return price;
//     }

//     public String getbrand()
//     {
//         return brand;
//     }
// }



// public class enc {
//     public static void main(String []a)
//     {
//         toothpaste tp = new toothpaste();

//         System.out.println(tp.getprice() + " : " + tp.getbrand() );
//     }
// }


// Now for setting the value after calling the instance variable in main class.......


class toothpaste
{
    private int price;
    private String brand ;         
                              
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



public class enc {
    public static void main(String []a)
    {
        toothpaste tp = new toothpaste();
         tp.setprice( 98) ;
         tp.setbrand("dantkanti");

        System.out.println(tp.getprice() + " : " + tp.getbrand() );
    }
}

