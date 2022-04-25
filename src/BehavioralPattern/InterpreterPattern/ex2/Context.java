package BehavioralPattern.InterpreterPattern.ex2;

public class Context {
    private String input;
    private int output;

    public Context(String input, int output) {
        this.input = input;
        this.output = output;
    }

    public Context() {
    }

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
