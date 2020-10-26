/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhaoxi
 */
class SeatList {

 private List<Seat> seatList ;
 
    public SeatList() {
        seatList = new ArrayList<Seat>();
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    
    public void addSeat(Seat s){
        seatList.add(s);
    }
    
    public void removeSeat(Seat s){
        seatList.remove(s);
    }
    
    
}
