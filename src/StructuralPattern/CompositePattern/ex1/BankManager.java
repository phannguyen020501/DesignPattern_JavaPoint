package StructuralPattern.CompositePattern.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee{
    private int id;
    private String name;
    private double salary;

    public BankManager(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<>();

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
        System.out.println("id = "+ getId());
        System.out.println("name = "+getName());
        System.out.println("salary = "+getSalary());

        Iterator<Employee> it = employees.iterator();
        while(it.hasNext()){
            Employee employee = it.next();

            employee.print();
        }
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }
}
