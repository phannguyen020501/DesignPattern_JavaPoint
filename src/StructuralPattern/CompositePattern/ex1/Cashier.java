package StructuralPattern.CompositePattern.ex1;

public class Cashier implements Employee{
    /* in this class, there are many methods which are not applicable to cashier because
        it is leaf node
     */
    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("salary = "+salary);
    }

    @Override
    public void add(Employee employee) {
        //this is a leaf so this method is not applicable to this class
    }

    @Override
    public void remove(Employee employee) {
        //this is a leaf so this method is not applicable to this class
    }

    @Override
    public Employee getChild(int i) {
        return null;
    }
}
