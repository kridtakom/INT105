
package oop.Book;


public class Book {
    
    private String name;
    private String category;
    private static int countlan;
    private static int countsci;

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
        if(category.equalsIgnoreCase("language")){
            countlan++;
        }
        else if(category.equalsIgnoreCase("science")) {
            countsci++;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static int getCountlan() {
        return countlan;
    }

    public static int getCountsci() {
        return countsci;
    }
    
    public static int numOfBookByCategory(String category){
        int ans=0;
        if(category.equalsIgnoreCase("language")){
          ans =   countlan;
           
        }else if(category.equalsIgnoreCase("science")){
          ans =   countsci;
        }
       return ans;
    }
}
    

