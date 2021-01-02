package assignment1;
import java.util.Scanner;

/**
 * Simple class for task 2 of assignment 1
 * @author maria ramlochan
 */
public class Task2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***** STRING SCORE *****" + "\nEnter a string: ");
        String str  = sc.nextLine();
        System.out.printf("String Score: %.2f\n", countStringScore(str));
    }
    
     /**
     * Method to count a score of a string
     * @param str
     * @return the score of a string
     */
    public static double countStringScore(String str) {
        double score = 0;
        
        if(str == null || str.isEmpty() || str.length() == 0) {
            return score = 0;
        }
        
        else {
            for (int i = 0; i < str.length(); i++) {

                if (Character.isSpaceChar(str.charAt(i)))
                    score += 0; 

                else if (Character.isDigit(str.charAt(i)))
                    score += 1;

                else if (Character.isLetter(str.charAt(i)))
                    score += 2;

                else 
                    score += 3;
            }
        }
        return score / str.length();
    }
    
}