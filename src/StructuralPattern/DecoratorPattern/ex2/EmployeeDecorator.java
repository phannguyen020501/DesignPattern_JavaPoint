package StructuralPattern.DecoratorPattern.ex2;

import java.util.Date;

public class EmployeeDecorator implements  EmployeeComponent{
    protected EmployeeComponent employee;

    public EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void doTask() {

    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }
}
