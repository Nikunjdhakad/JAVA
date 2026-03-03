public class co {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 

        // TODO: Run the loop while 'again' equals 'y'
        
        while(again == "y"){
        
        
        // TODO: Perform the calculation based on the operator using if-else conditions
        
        if(operator=='+'){
            System.out.println("Result:" + (num1+num2));
        }
        else if(operator=='-'){
            System.out.println("Result:" + (num1-num2));
        }
        else if (operator=='*'){
            System.out.println("Result:" + (num1*num2));
        }
        else if(operator=='/'){
            // TODO: Check if num2 is zero before performing division and display a warning if true
            if (num2 == 0){
                System.out.println("Cannot divide by zero.");
            }else{
                System.out.println("Result:" + (num1/num2));
            }
        }
        else{
            System.out.println("Invailid input");}
            // TODO: Set 'again' to 'n' to stop the loop after one execution
        
        again = "n";   
        }
        // TODO: Display a thank you message after the loop ends
        System.out.println("Thank you for using the calculator.");
    }
        
    }


