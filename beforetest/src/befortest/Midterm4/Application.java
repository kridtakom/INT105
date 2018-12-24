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
public class Application extends Items{

    public Application() {
    }

    public Application(String appName, String category, double price, String orderBy) {
        super(appName, category, price, orderBy);
    }

   public String getType() {
    return "1";
    }
    
}
