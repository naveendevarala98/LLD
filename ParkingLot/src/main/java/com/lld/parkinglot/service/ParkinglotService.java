package com.lld.parkinglot.service;

import com.lld.parkinglot.model.Parkingfloor;

import java.util.ArrayList;
import java.util.List;

public class ParkinglotService {

    int id;
    String address;

    public  List<Parkingfloor> parkingfloorList = new ArrayList<>();


    public ParkinglotService(int id, String address){
        this.id = id;
        this.address=address;
    }

    public void addparkingFloor(Parkingfloor parkingfloor){
        parkingfloorList.add(parkingfloor);
    }

    public List<Parkingfloor> getParkingFloor(){
        return parkingfloorList;
    }
}
