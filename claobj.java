class addition 
{
    int X;
    public int add(int n1,int n2 ) 
    {int r = n1 + n2;
   
    return r;}
    {
    System.out.println("yes");}
}


public class claobj {
    public static void main(String arg[]){
        int num1 = 4;
        int num2 = 7;
        
        addition sum = new addition();

       int result = sum.add(num1,num2);

        System.out.println(result);
    }
}
