class student
{
    int rollno; 
    String name;
    int marks;
}



public class objarr {
    public static void main( String args[])
    {
        student s1 =new student();
        s1.rollno = 58;
        s1.name = "atharv";
        s1.marks= 100;

        student s2 =new student();
        s2.rollno = 59;
        s2.name = "balram";
        s2.marks= 64;

        student s3 =new student();
        s3.rollno = 60;
        s3.name = "shyam_";
        s3.marks= 78;

        student s4 =new student();
        s4.rollno = 61;
        s4.name = "anant_";
        s4.marks= 89;


        student students[] = new student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;



        // PRINTING BY USING NORMAL FOR LOOP:----/

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].rollno  + "     |    " + students[i].name + "     |    " + students[i].marks);
        }

        //  PRINT BY USING ENHANCED FOR LOOP:----/

        for(student st : students)
        {
            System.out.println(st.name + "         |       " + st.rollno +"         |       " + st.marks);
        }
    }
}
