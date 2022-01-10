package StructuralPattern.CompositePattern;

public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Cashier(101,"pn",2000);
        Employee emp2 = new Cashier(102, "hl", 2000);
        Employee emp3 = new Accountant(103, "th", 1500);
        Employee manager1 = new BankManager(100,"md", 3000);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);

        manager1.print();
    }
}
