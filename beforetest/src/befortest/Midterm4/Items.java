/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package befortest.Midterm4;

/**
 *
 * @author Kridtakom
 */
public abstract class Items {

    protected String appName;
    protected String category;
    private double price;
    private String orderBy;

    public Items() {
    }

    public Items(String appName, String category, double price, String orderBy) {
        this.appName = appName;
        this.category = category;
        this.price = price;
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Items{" + "appName=" + appName + ", category=" + category + ", price=" + price + ", orderBy=" + orderBy + '}';
    }
    
    

}
