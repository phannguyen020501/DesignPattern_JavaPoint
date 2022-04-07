package CreationalPattern.BuilderPattern.Ex4_immutable;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("pn", "123")
                .withAddress("hn").withEmail("pn147852").wantMobileBanking(true).wantNewsletter(true)
                .build();
        System.out.println(bankAccount);
    }
}
