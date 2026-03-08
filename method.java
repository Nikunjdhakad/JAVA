class hostel
{
    public void room()
    {
        System.out.println(22);
        
    }

    public int classroom()
    {
        return 205;
    }

    public String student()
    {
        return "sushmita";
    }
}


public class method {
    public static void main(String args[])
    {
        hostel host = new hostel();

          host.room();

           int X = host.classroom();
             {
                System.out.println(X);
             }

             String Y = host.student();

             {
                System.out.println(Y);
             }

    }
}
