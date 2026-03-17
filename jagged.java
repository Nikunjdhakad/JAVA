public class jagged {
    public static void main(String a[])
    {
        int nums [][]=new int [4][];

        nums[0]= new int [4];
        nums[1]= new int [6];
        nums[2]= new int [8];
        nums[3]= new int [7];

        for(int i=0; i<nums.length; i ++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j]= (int)(Math.random() *10);
            }

        }
         
        for (int n[] : nums)
        {
            for(int m:n)
            {
                System.out.print(m+"  ");
            }
            System.out.println();
        }
    }
}
