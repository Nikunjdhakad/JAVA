class hostel
{
    public void room()
    {
        System.out.println(44);
        
    }

    public  int classroom(int year)
    {
        if (year <= 4)
        return 205;
        
        else 
            return 0;
    }

    public String student( float hieght )
    {
        if (hieght >= 6.10f)
        return "sushmita";
        
        else
            return "too Small";
    }
}


public class method {
    public static void main(String args[])
    {
        hostel host = new hostel();

          host.room();

           int X = host.classroom( 3);
             {
                System.out.println(X);
             }

             String Y = host.student(5.5f);

             {
                System.out.println(Y);
             }

    }
}
