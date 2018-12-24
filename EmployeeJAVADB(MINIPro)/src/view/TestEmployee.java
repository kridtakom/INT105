package view;

import Controller.EmployeeController;
import Model.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestEmployee {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            prop.setProperty("user", "sit");
            prop.setProperty("password", "sit");
            EmployeeController emyctrl = new EmployeeController(prop);
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu Function \n"
                    + "1.Find Employee \n"
                    + "2.Create Employee \n"
                    + "3.Delete Employee \n"
                    + "4.Update Employee \n"
                    + "0.Exit");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter Menu function : ");
            int button = sc.nextInt();
            while (button != 0) {
                switch (button) {
                    case 1:
                        System.out.println("function \n"
                                + "1.FindById\n"
                                + "2.FindByName\n"
                                + "3.FindBySurname\n"
                                + "4.FindBySalary\n"
                                + "0.End Find");
                        System.out.print("Enter Function Find : ");
                        int func = sc.nextInt();
                        if (func != 0) {
                            do {
                                switch (func) {
                                    case 1:
                                        System.out.print("Enter id : ");
                                        int id = sc.nextInt();
                                        emyctrl.findById(id);
                                        for (Employee id2 : emyctrl.findById(id)) {
                                            System.out.println(id2);
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Enter name : ");
                                        String name = sc.next();
                                        emyctrl.findByName(name);
                                        for (Employee name2 : emyctrl.findByName(name)) {
                                            System.out.println(name2);
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Enter surname : ");
                                        String surname = sc.next();
                                        emyctrl.findBySurname(surname);
                                        for (Employee surname2 : emyctrl.findBySurname(surname)) {
                                            System.out.println(surname2);
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Enter salary : ");
                                        int salary = sc.nextInt();
                                        emyctrl.findBySalary(salary);
                                        for (Employee salary2 : emyctrl.findBySalary(salary)) {
                                            System.out.println(salary2);
                                        }
                                        break;
                                }
                                System.out.print("Enter Function Find : ");
                                func = sc.nextInt();
                            } while (func != 0);
                        }
                        System.out.println("..........................................................................................");
                        break;

                    case 2:
                        System.out.println("Please fill in the information ");
                        System.out.print("id : ");
                        int id = sc.nextInt();
                        System.out.print("name : ");
                        String name = sc.next();
                        System.out.print("surname : ");
                        String surname = sc.next();
                        System.out.print("salary : ");
                        double salary = sc.nextDouble();
                        Employee em = new Employee(id, name, surname, salary);
                        int insertRec = emyctrl.insertEmployee(em);
                        System.out.println("Created Employee " + insertRec);
                        System.out.print("Do you want to add Employee again ? "
                                + "(1.yes / 0.no) please enter function : ");
                        int in = sc.nextInt();
                        while (in != 0) {
                            System.out.println("Please fill in the information ");
                            System.out.print("id : ");
                            id = sc.nextInt();
                            System.out.print("name : ");
                            name = sc.next();
                            System.out.print("surname : ");
                            surname = sc.next();
                            System.out.print("salary : ");
                            salary = sc.nextDouble();
                            em = new Employee(id, name, surname, salary);
                            insertRec = emyctrl.insertEmployee(em);
                            System.out.println("Created Employee " + insertRec);
                            System.out.print("Do you want to add Employee again ? "
                                    + "(1.yes / 0.no) please enter function : ");
                            in = sc.nextInt();
                        }
                        System.out.println("..........................................."
                                + "...............................................");
                        break;

                    case 3:
                        System.out.println("Delete from Id");
                        System.out.print("Enter id that you need to delete : ");
                        int numOfId = sc.nextInt();
                        int deleteRec = emyctrl.DeleteEmployee(numOfId);
                        System.out.println("Deleted Employee " + deleteRec);
                        System.out.print("Do you wnat to delete agian (1.yes/0.no ) "
                                + "please enter number of function : ");
                        int again = sc.nextInt();
                        while (again != 0) {
                            System.out.print("Enter id that you need to delete : ");
                            numOfId = sc.nextInt();
                            deleteRec = emyctrl.DeleteEmployee(numOfId);
                            System.out.println("Deleted Employee " + deleteRec);
                            System.out.print("Do you wnat to delete agian (1.yes/0.no ) "
                                    + "please enter number of function : ");
                            again = sc.nextInt();
                        }
                        System.out.println("....................................."
                                + ".....................................................");
                        break;

                    case 4:
                        System.out.println("Update Employee");
                        System.out.println("1.update name\n"
                                + "2.update surname\n"
                                + "3.update salary \n"
                                + "0.End function update");
                        System.out.print("Enter function update : ");
                        int function = sc.nextInt();
                        if (function != 0) {
                            do {
                                System.out.print("Do you want to update from id : ");
                                int idForYou = sc.nextInt();
                                switch (function) {
                                    case 1:
                                        System.out.print("Please provide a new name : ");
                                        int upName = emyctrl.updateName(sc.next(), idForYou);
                                        System.out.println("Updated name successed " + upName);
                                        break;
                                    case 2:
                                        System.out.print("Please provide a new name : ");
                                        int upSur = emyctrl.updateSurname(sc.next(), idForYou);
                                        System.out.println("Updated surname successed " + upSur);
                                        break;
                                    case 3:
                                        System.out.print("Please provide a new salary : ");
                                        int upSala = emyctrl.updateSalary(sc.nextInt(), idForYou);
                                        System.out.println("Updated surname successed " + upSala);
                                        break;
                                }
                                System.out.print("Enter function update : ");
                                function = sc.nextInt();
                            } while (function != 0);
                        }

                        System.out.println("..........................................................................................");
                        break;

                }
                System.out.print("Enter Menu function : ");
                button = sc.nextInt();
            }

            System.out.println("END");
            emyctrl.close();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
    }

}
