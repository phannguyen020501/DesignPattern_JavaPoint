package StructuralPattern.AdapterPattern.ex2;

public class JapaneseAdaptee {
    public void receive(String words){
        System.out.println("retrieving words from adapter...");
        System.out.println(words);
    }
}
