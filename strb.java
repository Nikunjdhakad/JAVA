public class strb {
    public static void main(String[]a)
    {
        StringBuffer temple = new StringBuffer("Ayodhya ");

        temple.append( " Ram ");
        temple.insert(0,"Shree ");
        //temple.setLength();
        System.out.println(temple);
        temple.setLength(55); //this line set the new length or capacity of the string......
        System.out.println(temple.capacity());

    }
}
