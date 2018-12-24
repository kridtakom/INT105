/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author Kridtakom
 */
public class Student {
    private int stdId;
    private String firstname;
    private String lastname;

    public Student() {
    }

    public Student(int id, String firstname, String lastname) {
        this.stdId = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getstdId() {
        return stdId;
    }

    public void setstdId(int stdId) {
        this.stdId = stdId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + stdId + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
    
    
    
}
