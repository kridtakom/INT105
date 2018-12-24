/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import sit.controller.StudentController;
import sit.model.Student;

/**
 *
 * @author Kridtakom
 */
public class TestStudentDB {

    public static void main(String[] args) {
//        try {
//            StudentController stdcrl = new StudentController("sit", "sit");
//        } catch (ClassNotFoundException cnfEx) {
//            System.out.println(cnfEx);
//        } catch (SQLException sqlEx) {
//            System.out.println(sqlEx);
//        } 
        try {
            Properties dbPros = new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtl = new StudentController(dbPros);
            int recs = stdCtl.insertStudent(new Student (99,"james","bonds"));
            System.out.println(recs);
            stdCtl.close();
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
    }

}
