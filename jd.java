public class jd {
    public static void main(String a[])
    {
        int arr[][][][] = new int[3][3][3][3];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                for(int k=0; k<arr.length; k++)
                {
                   for(int l=0; l<arr.length; l++)
                {
                    arr[i][j][k][l]= (int) (Math.random() * 10);
                }
                }
            }
        }

        for(int n[][][]:arr)
        {
            for(int[][] m : n)
            {
                for (int p[] : m)
                {
                    for (int x : p)
                {
                    System.out.print(x +"  ");
                }
                System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

