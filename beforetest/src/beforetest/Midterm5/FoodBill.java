
package beforetest.Midterm5;

/**
 *
 * @author Kridtakom
 */
public class FoodBill extends Bill{
    
    private static long count;
    public FoodBill(Customer cust, double totalPrice) {
        super(cust, totalPrice);
    }
    
    public static long getNumOfBill(){
        count++;
        return count;
    }
    
    
    
}
