/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testio.OOP;

/**
 *
 * @author Kridtakom
 */
public class Student {
    private int id;
    private String fName;
    private String lName;

    public Student() {
    }

    public Student(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + '}';
    }
    
    
}
