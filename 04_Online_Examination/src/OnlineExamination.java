import java.util.Scanner;

public class OnlineExamination {

    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        login();
        startExam();
        showResult();
    }

    static void login() {
        System.out.println("=== Online Examination Login ===");
        System.out.print("Enter Username: ");
        scanner.nextLine();
        System.out.print("Enter Password: ");
        scanner.nextLine();
        System.out.println("\nLogin successful\n");
    }

    static void startExam() {

        askQuestion(
                "Which language is mainly used for backend development?",
                "1. HTML",
                "2. CSS",
                "3. Java",
                "4. Bootstrap",
                3
        );

        askQuestion(
                "Which keyword is used to inherit a class in Java?",
                "1. implements",
                "2. extends",
                "3. super",
                "4. this",
                2
        );

        askQuestion(
                "Which collection does not allow duplicate values?",
                "1. List",
                "2. ArrayList",
                "3. Set",
                "4. Map",
                3
        );
    }

    static void askQuestion(String question, String op1, String op2,
                            String op3, String op4, int correctAnswer) {

        System.out.println(question);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
        System.out.print("Enter your answer: ");

        int userAnswer = scanner.nextInt();
        if (userAnswer == correctAnswer) {
            score++;
        }
        System.out.println();
    }

    static void showResult() {
        System.out.println("=== Examination Completed ===");
        System.out.println("Your Score: " + score);
        System.out.println("Thank you for attending the examination");
    }
}
