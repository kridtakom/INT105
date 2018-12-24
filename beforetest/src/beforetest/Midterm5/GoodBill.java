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
public class GoodBill extends Bill{
    private static long count;
   
    public GoodBill(Customer cust, double totalPrice) {
        super(cust, totalPrice);
    }
    
    public long getNumOfBill(){
        count++;
        return count;
    }
    
    
    
}
