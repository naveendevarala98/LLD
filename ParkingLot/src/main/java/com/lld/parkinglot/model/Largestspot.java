package com.lld.parkinglot.model;

public class Largestspot extends Parkingspot{

    public Largestspot(int noOfSpot) {
        super(noOfSpot);
    }

    public int getSpot(){
        return noOfSpot;
    }
}
