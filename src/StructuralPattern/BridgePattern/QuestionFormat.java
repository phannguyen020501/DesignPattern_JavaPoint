package StructuralPattern.BridgePattern;

public class QuestionFormat extends QuestionManager{

    public QuestionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll(){
        System.out.println("--------------------------");
        super.displayAll();
        System.out.println("--------------------------");
    }
}
