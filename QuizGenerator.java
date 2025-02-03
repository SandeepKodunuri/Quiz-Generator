import java.util.Arrays;

public class QuizGenerator {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        // Adding sample Questions
        quiz.addQuestion(new Question("What is the capital of India?",  Arrays.asList("Mumbai","New Delhi", "Kolkata", "Chennai" ), 2));
        quiz.addQuestion(new Question("Who was the 1st President of India?",  Arrays.asList("Dr. Rajendar Prasad","Jawaharlal Nerhu", "Dr.B.R. Ambedkar", "Sadar Patel" ), 1));
        quiz.addQuestion(new Question("Which river is Known as the Ganga of the South?",  Arrays.asList("Godavari"," Krishna", "Kaveri", "Yamuna" ), 3));
        quiz.addQuestion(new Question("Who is known as the Missile Man of India?",  Arrays.asList("Vikram  Sarabhai","Dr.A.P.J. Abdul Kalam", "Homi Bhabha", "C.V.Raman" ), 2));
        quiz.addQuestion(new Question("Which is the largest state in india by area?",  Arrays.asList("Maharashtra","Madhya Pradesh", "Rajasthan", "Uttar Pradesh" ), 3));
        quiz.startQuiz();
    }
}