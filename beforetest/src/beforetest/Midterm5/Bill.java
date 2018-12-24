/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforetest.Midterm5;

/**
 *
 * @author Kridtakom
 */
public abstract class Bill {
    protected long billId;
    private Customer cust;
    private double totalPrice;
    private double promoPrice;

    
    public Bill(Customer cust, double totalPrice) {
        this.cust = cust;
        this.totalPrice = totalPrice;
        billId++;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPromoPrice(Bill bill,double minPrice,double percentPro,double maxPro) {
        this.promoPrice = promoPrice;
    }

    @Override
    public String toString() {
        return "Bill{" + "billId=" + billId + ", cust=" + cust + ", totalPrice=" + totalPrice + ", promoPrice=" + promoPrice + '}';
    }
    
    
}
