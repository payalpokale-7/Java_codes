import java.util.Scanner;
//java program to take an integer as input and print it
public class read {
    public static void main(String args[]) {

        //Declare the variables
        int num;
        //input the integer
        System.out.println("Enter the Integer: ");
        try (//create Scanner object
        Scanner s = new Scanner(System.in)) {
            //Read the next integer from the screen
            num = s.nextInt();
        }
        //Display the integer
        System.out.println("Entered integer is: " +num);   
    }  
}
