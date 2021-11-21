package CreationalPattern.PrototypePattern;

public class EmployeeRecord implements Prototype{
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(){
        System.out.println("employee records of oracle corporation");
        System.out.println("--------------------------------------");
        System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");

    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address){
        this();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
    }

    public void showRecord(){
        System.out.println(id +"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }
}
