/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import sit.db.ConnectionManager;
import sit.model.Student;

/**
 *
 * @author Kridtakom
 */
public class StudentController {

    private Connection con;

    public StudentController(String username, String psw)
            throws ClassNotFoundException, SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager.createConnection(url, username, psw);

        System.out.println("Connection created successfully");
    }

    public StudentController(Properties pro)
            throws SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager.createConnection(url, pro);
        System.out.println("Connection created successfully");
    }

    public int deleteAllStudents() throws SQLException {
        int deleteRecs = 0;
        String sql = "delete from student";
        Statement stmt = con.createStatement();
        deleteRecs = stmt.executeUpdate(sql);
        return deleteRecs;
    }

    public int insertStudent(Student std) throws SQLException {
        int insertedRecs = 0;
        int id=std.getstdId();
        String fName = std.getFirstname();
        String lName= std.getLastname();
        String sql = "insert into student("+"stdId, firstname, lastname) values("+id+", '"+fName+"', '"+lName+"')";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        insertedRecs = stmt.executeUpdate(sql);
        return insertedRecs;
    }
   

    public void close() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
}
