import java.util.Scanner;

public class FinallyDemo {
    
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        // TODO: Read a and b
        int a=sc.nextInt();
        int b=sc.nextInt();
         
        // TODO: try block
        try { 
            int result = a/b; // Perform division
            System.out.println("Result: " + result); // Print "Result: " + result
        }
        
        // TODO: catch ArithmeticException e
        catch(ArithmeticException e){
               System.out.println("Error: " + e.getMessage()); // Print "Error: " + e.getMessage()
        }
        
        // TODO: finally block
        finally {
            System.out.println("Finally block executed"); // Print "Finally block executed"
        }
        
        sc.close();
    }
}
