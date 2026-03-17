public class threed {
    public static void main (String a[])
    {
        int arr[][][]= new int [2][3][4];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                for(int k=0; k<arr.length; k++)
                {
                    arr[i][j][k]=(int)(Math.random() *10);
                }
            }
        }

         for(int[][] n : arr)
        {
            for(int[] m : n)
            {
                for(int x : m)
                {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
