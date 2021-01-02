package assignment1;
import java.util.Scanner;

/**
 * Simple class for task 1 of assignment 1
 * @author maria ramlochan
 */
public class Task1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("***** NUMBER REVERSE *****" + "\nEnter a number: ");
        num = sc.nextInt();

        System.out.println("\nReversed number: " + reverseNum(num));
    }
    
    /**
     * Method to reverse an integer number
     * @param num the number inputted
     * @return the number in reverse
     */
    public static int reverseNum(int num) {
        int reversed = 0; 
        
        while (num != 0) {
            reversed = (reversed * 10) + (num % 10);
            num = num / 10;
        }
        return reversed;
    }
    
}
