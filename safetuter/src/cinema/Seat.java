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
public class Seat {
    private int num;
    private String row;
    private boolean available;

    public Seat() {
    }

    public Seat( String row ,int num) {
        this.num = num;
        this.row = row;
        this.available = true;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Seat{" + "num=" + num + ", row=" + row + ", available=" + available + '}';
    }
    
    
}
