//  STATIC VARIABLE CODE AND UNDERSTANDIG WHAT IS STATIC WORD AND WHAT ITS USE IN JAVA

class laptop
{
    int price;
    static String brand;
    String condition ;

    public void show()
    {
        System.out.println(price + " : " + brand +" : " + condition);
    }
    
}


public class stat {
    public static void main(String[]a)
    {
        laptop obj =new laptop();
        obj.price=75000;
        laptop.brand = "HP";
        obj.condition="new";

        

        laptop obj1 = new laptop();
        laptop.brand= "MACBOOK";
        obj1.price = 90000;
        obj1.condition= "refervised";

        laptop obj2 = new laptop();
        laptop.brand= "Samsung";
        obj2.price = 90000;
        obj2.condition= "refervised";



        obj.show();
        obj1.show();
        obj2.show();

    }
}
