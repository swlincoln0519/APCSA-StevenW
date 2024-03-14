public class Question {
    private int totalQuestions = 0;
    private String mcA = "";
    private String mcB = "";
    private String mcC = "";
    private String mcD = "";
    private char answer;

    public void showQuestion() {
        
    }

    public int getTotalQuestions() {
        return this.totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public String getMcA() {
        return this.mcA;
    }

    public void setMcA(String mcA) {
        this.mcA = mcA;
    }

    public String getMcB() {
        return this.mcB;
    }

    public void setMcB(String mcB) {
        this.mcB = mcB;
    }

    public String getMcC() {
        return this.mcC;
    }

    public void setMcC(String mcC) {
        this.mcC = mcC;
    }

    public String getMcD() {
        return this.mcD;
    }

    public void setMcD(String mcD) {
        this.mcD = mcD;
    }

    public char getAnswer() {
        return this.answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
}