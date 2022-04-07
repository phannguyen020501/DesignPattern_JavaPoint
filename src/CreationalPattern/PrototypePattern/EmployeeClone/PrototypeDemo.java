package CreationalPattern.PrototypePattern.EmployeeClone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.println("enter name: ");
        String ename = br.readLine();
        System.out.println("\n");

        System.out.println("enter designation: ");
        String edesignation = br.readLine();
        System.out.println("\n");

        System.out.println("enter address: ");
        String eaddress = br.readLine();
        System.out.println("\n")
        ;
        System.out.println("enter salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.println("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
