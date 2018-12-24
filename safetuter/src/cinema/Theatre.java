/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Kridtakom
 */
public class Theatre {
    private Seat seat[];

    public Theatre() {
        
    }

    public Theatre(Seat[] seat) {
        this.seat= new Seat[50]; 
        int count = 0;
        String row = null;
        for (int i = 0; i < 5   ; i++) {
            for (int j = 1; j <= 10; j++) {
                switch (i){
                    case 0:  row="AA" ; break;
                    case 1:  row="BB" ; break;
                    case 2:  row="CC" ; break;
                    case 3:  row="DD" ; break;
                    case 4:  row="EE" ; break;
                }
                seat[count] = new Seat(row,j);
            }
        }
    }
    
    
}
