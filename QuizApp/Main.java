import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        start();
    } 

    private static void start() {
        Quiz quiz = new Quiz("WaxOnWaxOff", true);

        Question q1 = new Question("Which of the following isn't a primitve type in Java?", "int", "char", "boolean", "string", 'D', 3);
        quiz.addQuestion(q1);
        Question q2 = new Question("What is the decimal equivalent of 11101?", "28", "31", "29", "27", 'C', 4);
        quiz.addQuestion(q2);
        Question q3 = new Question("Which of the following is printed as a result of 5 % 3", "2", "3", "1", "0", 'A', 4);
        quiz.addQuestion(q3);
        Question q4 = new Question("Which of the following initializes a variable?", "int c = '';", "String dog = cat;", "boolean isFound = false;", "double double = 0;", 'C', 4);
        quiz.addQuestion(q4);
        Question q5 = new Question("What will this code snippet print?\nint x = 3\n double y = 4.5;\ny = x + y;\nx = (int) y;\nSystem.out.print(x); ", "7.5", "8", "7.0", "7", 'D', 5);
        quiz.addQuestion(q5);

        quiz.displayQuestions();
        quiz.start();
    }
}
