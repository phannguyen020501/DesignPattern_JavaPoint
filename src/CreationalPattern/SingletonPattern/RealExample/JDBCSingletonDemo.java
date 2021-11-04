package CreationalPattern.SingletonPattern.RealExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class JDBCSingletonDemo {
    static int count = 1;
    static int choice;

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Database operations");
            System.out.println("------------------------");
            System.out.println("1. Insertion");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.println("\n");
            System.out.println("Enter choice:");
            choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1:{
                    System.out.println("Enter username:");
                    String  username = br.readLine();
                    System.out.println("Enter password:");
                    String password = br.readLine();

                    try{
                        int i = jdbc.insert(username, password);
                        if( i > 0){
                            System.out.println((count++) + "Data has been inserted successfully");
                        }else{
                            System.out.println("Data has not been inserted");
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }

                    System.out.println("Enter key to continue...");
                    System.in.read();
                }//end of case1
                break;
                case 2:{
                    System.out.println("Enter username:");
                    String username = br.readLine();
                    try{
                        jdbc.view(username);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    System.out.println("Enter key to continue...");
                    System.in.read();
                }
                break;
                case 3:{
                    System.out.println("Enter id, you want to delete:");
                    int id = Integer.parseInt(br.readLine());
                    try{
                        int i = jdbc.delete(id);
                        if(i > 0){
                            System.out.println((count++)+ "Data has been deleted successfully");
                        }else{
                            System.out.println("Data has not been deleted");
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    System.out.println("Enter to continue...");
                    System.in.read();
                }
                break;
                case 4:{
                    System.out.println("Enter username you want to update: ");
                    String username = br.readLine();
                    System.out.println("Enter new password:");
                    String password = br.readLine();
                    try{
                        int i = jdbc.update(username, password);
                        if(i > 0){
                            System.out.println((count++)+"Data has been updated successfully");
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    System.out.println("Enter to continue....");
                }
                break;
                default: return;
            }
        }while(choice != 4);
    }
}
