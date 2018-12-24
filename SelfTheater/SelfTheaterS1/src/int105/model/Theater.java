package int105.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tisanai.Cha
 */
public class Theater {

    private int theaterId;
    private Seat[] seats;
    //add code here

    public Theater(int theaterId, Seat[] seats) {
        this.theaterId = theaterId;
        this.seats = seats;
    }
    
    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

//    public boolean reserveSeat(int seatId) {
//     	//add code here
//    }

    public int countNoReserveSeat() {
       	int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i].isSeatSelected()) {
                count++;
            }
        }
        return count;
    }

//    public int countNoReserveSeat(String classSeat) {
//     	//add code here
//    }

    @Override
    public String toString() {
        String seatAll = "";
        for (Seat seat : seats) {
            seatAll += seat.toString() + "\n";
        }
        return "Theater{" + "theaterId=" + theaterId + "\nseats=" + seatAll + '}';
    }

}
