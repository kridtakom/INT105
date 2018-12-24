
package oop;


public class Classbook {
    private String isbn;
    private String title;
    private String author;
    private double price; 
    private int tax;
    private double TotalPriceTax;
    
    public Classbook(){
    
    }
    public Classbook(int tax,String isbn,String title,String author,double price){
        this.tax = tax;
        this.isbn = isbn;
        this.title = title;
        this.author=author;
        this.price=price;
    }
    public Classbook(String isbn,String title,String author,double price){
        
        this.isbn = isbn;
        this.title = title;
        this.author=author;
        this.price=price;
    }
        
    public int getTax(){
        return tax;
    }
    public void setTax(int tax){
        this.tax=tax;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPriceTax() {
        return TotalPriceTax;
    }

    public void setTotalPriceTax(double TotalPriceTax) {
        this.TotalPriceTax = TotalPriceTax;
    }
    
    
    
    @Override
    public String toString(){
        return "Included Tax : "+(double)(price+(price*tax/100));
    }
    
}

