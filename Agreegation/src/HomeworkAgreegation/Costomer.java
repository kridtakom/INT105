
package HomeworkAgreegation;


public class Costomer {
   
    private long id;
    private String name;
    private String gender;
    private static int count;

    public Costomer(long id, String name, String gender) {
        count++;
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Costomer{" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }

    
    
    
   
}
