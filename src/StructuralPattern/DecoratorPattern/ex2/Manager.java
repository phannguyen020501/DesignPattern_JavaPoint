package StructuralPattern.DecoratorPattern.ex2;

public class Manager extends EmployeeDecorator{
    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement(){
        System.out.println(this.employee.getName() + " is creating requirement");
    }

    public void assignTask(){
        System.out.println(this.employee.getName() + " is assigning tasks");
    }
    public void manageProgress(){
        System.out.println(this.employee.getName() + " is managing the progress");
    }

    @Override
    public void doTask(){
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
