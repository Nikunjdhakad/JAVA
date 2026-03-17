public class twoD{
    public static void main (String args[]){
        int arr[][]= new int [5][9];

        for(int i=0; i<3; i++ )
        {
            for(int j=0; j<4; j++)
            {
               arr[i][j]= (int) (Math.random()*10 );
            }
            System.out.println();
        }


        for(int i=0; i<3; i++ )
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}