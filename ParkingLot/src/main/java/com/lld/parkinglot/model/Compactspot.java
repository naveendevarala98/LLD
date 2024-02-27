package com.lld.parkinglot.model;

public class Compactspot extends Parkingspot{

    public Compactspot(int noOfSpot) {
        super(noOfSpot);
    }

    public int getSpot(){
        return noOfSpot;
    }
}
