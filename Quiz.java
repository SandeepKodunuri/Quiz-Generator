import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
       questions.add(question);
    }
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();
            if (question.checkAnswer(userAnswer)){
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong answer.\n");
            }
        }
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
        scanner.close();
    }

} 
