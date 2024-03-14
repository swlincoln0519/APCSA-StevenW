public class Quiz {
    
    private String quizName = "";
    private int totalPoints = 0;
    private boolean active;
    private ArrayList<Question> questions = new ArrayList<Question>();
    
    public void start() {
        
    }

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getTotalPoints() {
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

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getTotalQuestions() {
        int size = question.size();
        return size;
    }
}