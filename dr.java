public class dr {
    public static void main(String[] args) {
        
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
      
      
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // TODO: Initialize min and max with the first element

         int smallest = numbers[0];
         int largest = numbers[0];


        // TODO: Use an enhanced for loop to find min and max

        for (int num : numbers) 
            {
            if (num < smallest)
                 {
                   smallest = num;
                 }
            if (num > largest)
                 {
                largest = num;
            }
        }

        // TODO: Print the smallest and largest numbers

         System.out.println("Smallest:  " + smallest);
         System.out.println("Largest:  " + largest);
    }
}

