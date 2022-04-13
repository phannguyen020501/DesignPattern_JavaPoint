package StructuralPattern.DecoratorPattern.ex2;

public class Client {
    public static void main(String[] args) {
        System.out.println("normal employee: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("pn");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTeam leader");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nManager");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTeam leader and manager: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
