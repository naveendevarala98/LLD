package com.lld.parkinglot.model;

import java.util.ArrayList;
import java.util.List;

public class Parkingfloor {
    int id;
    List<Parkingspot> parkingspot = new ArrayList<>();



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addParkingSpot(Parkingspot parkingspot) {
        this.parkingspot.add(parkingspot);
    }

    public List<Parkingspot> getParkingspot() {
        return parkingspot;
    }

    public void displayBoard(){

    }
}
