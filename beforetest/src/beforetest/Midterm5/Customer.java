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
public class Customer {
    private long custId;
    private static long count;

    public Customer() {
        count++;
    }
    
    public long getNumofCustomer(){
        
        return count;
   
    }

    public long getCustId() {
        return custId;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId +count+ '}';
    }
    
}
  

