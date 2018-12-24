
package Controller;

import DB.ConnectionManager;
import Model.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class EmployeeController {

    private Connection con;

    public EmployeeController(Properties pro) throws SQLException {
        String url = "jdbc:derby://localhost:1527/Employee";
        con = ConnectionManager.createConnection(url, pro);
        System.out.println("Created Connection Successfully");
    }

    public int insertEmployee(Employee em) throws SQLException {
        int insertCount;
        int id = em.getId();
        String firstname = em.getFirstname();
        String lastname = em.getLastname();
        double salary = em.getSalary();
        String sql = "insert into Employee "
                + "(" + "id, firstname, lastname, salary ) "
                + "values(" + id + ",'" + firstname + "','" 
                + lastname + "',"+ salary +")";
        Statement stm = con.createStatement();
        insertCount = stm.executeUpdate(sql);
        return insertCount;
    }

    public int DeleteEmployee(int id) throws SQLException {
        int deleteCount;
        String sql = "DELETE FROM Employee WHERE id = " + id + " ";
        Statement stm = con.createStatement();
        deleteCount = stm.executeUpdate(sql);
        return deleteCount;
    }

    public Employee onlyEmployee
        (int id, String fName, String lName, double salary) {
        Employee em = new Employee();
        em.setId(id);
        em.setFirstname(fName);
        em.setLastname(lName);
        em.setSalary(salary);

        return em;
    }



    public ArrayList<Employee> findById(int idYou) throws SQLException {
        String sql = "select * from Employee where id = "+idYou+" ";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Employee> listEm = new ArrayList<Employee>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            double salary = rs.getDouble("salary");
            Employee emplo = onlyEmployee(id, firstname, lastname, salary);
            listEm.add(emplo);

        }
        return listEm;
    }

    public ArrayList<Employee> findByName(String name) throws SQLException {
        String sql = "select * from Employee " + "where firstname like '%" 
                + name + "%'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Employee> listEm = new ArrayList<Employee>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            double salary = rs.getDouble("salary");
            Employee emplo = onlyEmployee(id, firstname, lastname, salary);
            listEm.add(emplo);

        }
        return listEm;

    }

    public ArrayList<Employee> findBySurname(String surname) 
            throws SQLException {
        String sql = "select * from Employee " + "where lastname like '%" 
                + surname + "%'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Employee> listEm = new ArrayList<Employee>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            double salary = rs.getDouble("salary");
            Employee emplo = onlyEmployee(id, firstname, lastname, salary);
            listEm.add(emplo);

        }
        return listEm;
    }

    public ArrayList<Employee> findBySalary(double sala) throws SQLException {
        String sql = "select * from Employee " + "where salary = "+sala+"";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Employee> listEm = new ArrayList<Employee>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            double salary = rs.getDouble("salary");
            Employee emplo = onlyEmployee(id, firstname, lastname, salary);
            listEm.add(emplo);

        }
        return listEm;
    }

    /*public void executeSQLCommand(String sql) throws SQLException {
        ArrayList<Employee> listEm = null;
        Statement stmt = con.createStatement();
        boolean isSelectCmd = stmt.execute(sql);
        if (isSelectCmd) {
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                double salary = rs.getDouble("salary");
                Employee emplo = onlyEmployee(id, firstname, lastname, salary);
                listEm.add(emplo);

            }
            for(Employee em:listEm){
                System.out.println(em);
            }
        } else {
            int updateRecs = stmt.getUpdateCount();
            System.out.println(updateRecs + " Updated Records");
        }
        
    }*/
    public int updateName(String name,int id) throws SQLException {
        int updateCount;
        String sql = "update Employee set firstname = '"+name+"' "
                + "where id="+id+" ";
        Statement stm = con.createStatement();
        updateCount = stm.executeUpdate(sql);
        return updateCount;
    }
    public int updateSurname(String surname,int id) throws SQLException {
        int updateCount;
        String sql = "update Employee set lastname = '"+surname+"'"
                + " where id="+id+" ";
        Statement stm = con.createStatement();
        updateCount = stm.executeUpdate(sql);
        return updateCount;
    }
    public int updateSalary(double salary,int id) throws SQLException {
        int updateCount;
        String sql = "update Employee set salary = "+salary+" "
                + "where id="+id+" ";
        Statement stm = con.createStatement();
        updateCount = stm.executeUpdate(sql);
        return updateCount;
    }
    
    public void close() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
}
