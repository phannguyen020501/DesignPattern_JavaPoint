package BehavioralPattern.InterpreterPattern.ex2;

public class ThousandExpression extends  Expression{
    @Override
    public String one() {
        return "M";
    }

    @Override
    public String four() {
        return " ";
    }

    @Override
    public String five() {
        return " ";
    }

    @Override
    public String nine() {
        return " ";
    }

    @Override
    public int multiplier() {
        return 1000;
    }
}
