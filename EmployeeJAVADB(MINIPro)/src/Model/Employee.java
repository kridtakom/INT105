
package Model;


public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private double salary;
    
    public Employee(){
        
    }

    public Employee(int id,String firstname, String lastname, double salary) {
        this.id = id;
        this.lastname = lastname;
        this.salary = salary;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String fristname) {
        this.firstname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + "id = " + id + "   firstname = " + firstname + "   lastname = " + lastname + "   salary = " + salary ;
    }
    
    
    
}
