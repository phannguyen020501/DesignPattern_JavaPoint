package StructuralPattern.AdapterPattern.ex2;

public class TranslatorAdapter implements  VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String message) {
        System.out.println("reading words..");
        System.out.println(message);
        String vietnameseWord = this.translate(message);
        System.out.println("sending words..");
        adaptee.receive(vietnameseWord);
    }

    public String translate(String vnesewords){
        System.out.println("translated");
        return "tiếng nhật";
    }
}
