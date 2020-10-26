/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Flight.FlightSchedule;
import Business.Flight.FlightScheduleCatalog;

/**
 *
 * @author zhaoxi
 */
public class Passenger {
    private String firstName;
    private String lastName;
    private int id;
    private FlightScheduleCatalog fsc;
    private Account account;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public FlightScheduleCatalog getFsc() {
        return fsc;
    }

    public void setFsc(FlightScheduleCatalog fsc) {
        this.fsc = fsc;
    }

}
