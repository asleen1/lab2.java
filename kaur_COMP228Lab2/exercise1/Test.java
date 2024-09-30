package exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {
    String[] questions = {
        "What is Java?\n1. A fruit\n2. A programming language\n3. A car brand\n4. A planet",
        "Which of the following is not a Java keyword?\n1. static\n2. if\n3. else\n4. int",
        "Which method is used to start the execution of a Java program?\n1. main()\n2. start()\n3. init()\n4. run()",
        "Which company developed Java?\n1. Microsoft\n2. Apple\n3. Sun Microsystems\n4. Oracle",
        "What is the size of an int in Java?\n1. 2 bytes\n2. 4 bytes\n3. 8 bytes\n4. 16 bytes"
    };
    
    String[] correctAnswers = {"2", "2", "1", "3", "2"};
    Random random = new Random();
    
    public void simulateQuestion(int questionIndex) {
        String userAnswer = JOptionPane.showInputDialog(questions[questionIndex]);
        checkAnswer(questionIndex, userAnswer);
    }
    
    public void checkAnswer(int questionIndex, String answer) {
        if (correctAnswers[questionIndex].equals(answer)) {
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            JOptionPane.showMessageDialog(null, generateMessage(false) + " The correct answer is: " + correctAnswers[questionIndex]);
        }
    }
    
    public String generateMessage(boolean isCorrect) {
        String[] correctMessages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        String[] incorrectMessages = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.."};
        return isCorrect ? correctMessages[random.nextInt(4)] : incorrectMessages[random.nextInt(4)];
    }
    
    public void inputAnswer() {
        int correctCount = 0;
        int totalQuestions = questions.length;
        
        for (int i = 0; i < totalQuestions; i++) {
            simulateQuestion(i);
            String answer = JOptionPane.showInputDialog("Enter your answer (1-4):");
            
            if (correctAnswers[i].equals(answer)) {
                correctCount++;
            }
        }
        
        double percentage = ((double) correctCount / totalQuestions) * 100;
        JOptionPane.showMessageDialog(null, "Correct: " + correctCount + "\nIncorrect: " + (totalQuestions - correctCount) + "\nPercentage: " + percentage + "%");
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}
