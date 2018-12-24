
package array;


public class SitStudent {

    
    
    private long  id ;
    private String name ;

    public SitStudent() {
    }

    public SitStudent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Student ID : "+ id+ "\tName : "+name;
    }
    
}
