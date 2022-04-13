package StructuralPattern.DecoratorPattern.ex2;

public class TeamLeader extends EmployeeDecorator{
    public TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planning(){
        System.out.println(this.employee.getName() + " is planning");
    }
    public void motivate(){
        System.out.println(this.employee.getName()+ " is motivating");
    }

    public void monitor(){
        System.out.println(this.employee.getName() + " is monitoring");
    }

    @Override
    public void doTask(){
        employee.doTask();
        planning();
        motivate();
        monitor();
    }
}
