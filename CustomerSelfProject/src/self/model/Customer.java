package self.model;


public abstract class Customer  {
   
   private String surname;
    private String name;
    
    public Customer(){
        
    }
    public Customer(String name , String surname ){
        this.surname = surname;
        this.name = name;
        
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void setDiscountRate(double discountRate);
    public abstract double getDiscountRate();
    public abstract double redeemPoint2Cash(int usePoints);
    public abstract void addPointFromBuyingTotalPrice(double buyingPrice);

    @Override
    public String toString() {
        return "MemberCustomer{" + "surname=" + surname + ", name=" + name + '}';
    }
    
    
  
}
