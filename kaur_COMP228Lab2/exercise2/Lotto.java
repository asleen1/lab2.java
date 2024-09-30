
package exercise2;

import javax.swing.*;
import java.util.Random;

public class Lotto {
    private int[] numbers = new int[3];
    private Random random = new Random();
    
    // Constructor to populate the array with random numbers between 1 and 9
    public Lotto() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1;  // Random number between 1 and 9
        }
    }

    // Method to return the sum of the array numbers
    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Method to return the array numbers as a string for display
    public String getNumbersString() {
        return numbers[0] + ", " + numbers[1] + ", " + numbers[2];
    }

    public static void main(String[] args) {
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27:"));
        boolean userWins = false;
        
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lotto.getNumbersString() + "\nSum: " + sum);
            
            if (sum == userChoice) {
                JOptionPane.showMessageDialog(null, "You win!");
                userWins = true;
                break;
            }
        }
        
        if (!userWins) {
            JOptionPane.showMessageDialog(null, "Computer wins!");
        }
    }
}
