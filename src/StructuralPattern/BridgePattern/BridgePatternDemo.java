package StructuralPattern.BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programing Language");
        questions.q = new JavaQuestions();

        questions.delete("What is class");
        questions.display();
        questions.newOne("what is inheritance");
        questions.newOne("How many types of inheritance are there in java");
        questions.displayAll();
    }
}
