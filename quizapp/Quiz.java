import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    
    private String quizName;
    private int totalPoints;
    private boolean active;
    private ArrayList<Question> questions;

    public Quiz(String quizName, boolean active) {
        this.quizName = quizName;
        this.active = active;
        this.questions = new ArrayList<>();
    }
    
    public void start() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to WaxOnWaxOff!");
        int count = 0;
        int score = 0;
        displayQuestions();
        while (count < this.getTotalPoints()) {
            char answer = InputHelper.getChar("Type letter for your answer.");
            if (answer == questions.get(count).getAnswer()) {
                score++;
            }
            count++;
        }
        System.out.println("You score " + score + " out of " + this.getTotalPoints());
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getTotalPoints() {
        int totalPoints = 0;
        for (int i = 0; i < questions.size(); i++) {
            totalPoints += questions.get(i).getPointValue();
        }
        this.totalPoints = totalPoints;
        return this.totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }

    @Override
    public String toString() {
        return "Quiz{" +
            " quizName='" + getQuizName() + "'" +
            ", totalPoints='" + getTotalPoints() + "'" +
            ", active='" + isActive() + "'" +
            ", questions='" + getTotalQuestions() + "'" +
            "}";
    }
}
