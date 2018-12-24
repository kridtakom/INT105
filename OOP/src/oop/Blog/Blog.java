
package oop.Blog;


public class Blog {
    
    private String name;
    private boolean visible = true ;
    private String topic;
    private String content;
    private static int count , numvisible , numinvisible;

    public Blog(){
        count++;
    }
    public Blog(String name, boolean visible, String topic, String content) {
        count++;
        this.name = name;
        this.visible = visible;
        this.topic = topic;
        this.content = content;
        
        if(visible == true ){
            numvisible++;
        }
        else if (visible == false ){
            numinvisible++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        if(visible.equalsIgnoreCase("yes")){
            this.visible = true;
            numvisible++;
        }
        else{
            this.visible = false;
            numinvisible++;
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static int getCount() {
        return count;
    }

    public static int getNumvisible() {
        return numvisible;
    }

    public static int getNuminvisible() {
        return numinvisible;
    }
    

   
    
    
    
}
