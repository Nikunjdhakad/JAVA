class math{

    public int add(int m1 , int m2){
    
    int p= m1*m2;
    
    return p;}
}


public class demo {
    public static void main( String args[]){
        int num1=4;
        int num2=8;

        math score =new math();
       int Answer = score.add(num1,num2);

        System.out.println(Answer);
    }
}
