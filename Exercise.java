public class Exercise {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        if (score >=50)
          System.out.println("Passed");
        else
          System.out.println("Failed");

        // TODO: Determine grade based on score
       
       if(score >=90)
         System.out.println("Grade: A");
       
       else if(score> 74 && score< 90)
         System.out.println("Grade: B");
         
       else if (score>59 && score<75)
         System.out.println("Grade: C");
       
       else if(score<60)
         System.out.println("Grade: D");
       
   }
}