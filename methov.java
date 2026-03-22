
//* This code is for method overloading consepts */



class overloading{
  
   public  int add (int n1, int n2 )
{
    return n1+n2;
  }
 
   public int add (int n1, int n2, int n3)
   {
    return n1+n2+n3;
   }

   public double add(double n1, int n2, int n3)
   {
    return n1+n2+n3;
   }
}
public class methov {
    public static void main(String args [])
    {
       overloading plus = new overloading();

       double r = plus.add(4,9);
       System.out.println(r);
      
    }

}
/*-------------- */