// Code to create quiz application.
import java.util.*;
public class Question_104 {
    public static void main(String[] args) 
        {
            System.out.println("Welcome to the Quiz application");
            Scanner sc = new Scanner(System.in);
           String[] questions = {
            "1. What is the chief minister of Delhi?",
            "2. Which single line character is mandatory to terminate almost every statement in Java?",
            "3. What is Java mainly known for?",
            "4. Who holds the record for most hundreds in ODI cricket?",
            "5. The command javac is used to?"     };
        String[][] options = {
            {"A. Rekha Gupta", "B. Arvind Kejriwal", "C. Manish Sisodia", "D. Nitin Gadkari"},
            {"A. :", "B. ;", "C. =", "D. +"},
            {"A. Platform Independence", "B. Object-Oriented", "C. Robust", "D. Secure"},
            {"A. Sachin Tendulkar", "B. MS Dhoni", "C. Virat Kohli", "D. Sourav Ganguly"},
            {"A. Compile Java source files", "B. Run Java programs", "C. Debug Java programs", "D. Link Java libraries"}
        };
        char[] answers = {'A', 'B', 'A', 'C', 'A'};
        int score =0;
        for(int i=0;i<5;i++)
        {
            System.out.println("\n" + questions[i]);
            for (int j=0;j<4;j++) 
        {
                System.out.println(options[i][j]);
        }
        
        System.out.print("Enter your answer (A/B/C/D) : ");
        char useranswer = sc.next().charAt(0);
        if (useranswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }
        System.out.println("\n====================");
        System.out.println("Quiz Completed");
        System.out.println("Your Score: " + score + "/" + 5);
        System.out.println("====================");
}
}