package StructuralPattern.AdapterPattern.ex2;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("xin chao");
    }
}
