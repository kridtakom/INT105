
package oop.Employee;


public class Employee {
    
    private String name;
    private double salary;
    private boolean type;
    private static int count , countfull , countpart;

    public Employee() {
        count++;
    }

    
    public Employee(String name) {
        count++;
        this.name = name;
    }

//    public Employee(String name, double salary, String type) {
//        count++;
//        this.name = name;
//        this.salary = salary;
//        
//        if(type.equalsIgnoreCase("fulltime")){
//            this.type = true;
//            countfull++;
//        }else if (type.equalsIgnoreCase("parttime"))
//            this.type = false;
//            countpart++;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("fulltime")){
             this.type = true;
             countfull++;
        }else if(type.equalsIgnoreCase("parttime")){
             this.type = false;
             countpart++;
        }
    }

    public static int getCount() {
        return count;
    }

    public static int getCountfull() {
        return countfull;
    }

    public static int getCountpart() {
        return countpart;
    }

    @Override
    public String toString() {
        return "Number Of Employee : "+count + "staffs\n"
                +"Fulltime : "+countfull+ "staffs\n"
                +"Pulltime : "+countpart+ "staffs\n";
    }
    
    
}
