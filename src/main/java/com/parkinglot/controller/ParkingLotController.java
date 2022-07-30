package com.parkinglot.controller;

import com.parkinglot.dtos.*;
import com.parkinglot.model.*;
import com.parkinglot.service.ParkingLotService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDTO createParkingLot(CreateParkingLotRequestDTO requestDTO){
        CreateParkingLotResponseDTO responseDTO = new CreateParkingLotResponseDTO();
        if(requestDTO.getNoOffloors() <2){
            responseDTO.setResponseStatusDTO(ResponseStatusDTO.FAILED);
            return responseDTO;
        }
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(requestDTO.getAddress());
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        for(int i=0;i<requestDTO.getNoOffloors();i++){
            ParkingFloor floor = new ParkingFloor();
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for(int j =0;j<5;j++) {

                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setSpot_number(j+1);
                parkingSpot.setSpotStatus(ParkingSpotStatus.AVAILABLE);
                parkingSpot.setFloor(floor);
                parkingSpot.setSpotType(ParkingSpotType.SMALL);
                parkingSpots.add(parkingSpot);
            }

            floor.setFloorNumber(i+1);
            floor.addParkingSpots(parkingSpots);
            parkingFloorList.add(floor);
        }
        parkingLot.setFloors(parkingFloorList);
        ParkingLot createdParkingLot = parkingLotService.createParkingLot(parkingLot);

        responseDTO.setParkingLot(createdParkingLot);
        responseDTO.setResponseStatusDTO(ResponseStatusDTO.SUCCESS);
        return responseDTO;

    }

    public UpdateParkingLotResponseDTO updateParkingLot(UpdateParkingLotRequestDTO requestDTO){
        //get the id;
        //parkinglot from the id
        //update the address
        //save it to repository
        UpdateParkingLotResponseDTO responseDTO = new UpdateParkingLotResponseDTO();
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(requestDTO.getId());
        parkingLot.setAddress("Uttar Pradesh");
        ParkingLot updatedParkingLot = null;
        try {
            updatedParkingLot = parkingLotService.updateParkingLot(parkingLot);
        } catch (Exception e) {
            responseDTO.setResponseStatus(ResponseStatusDTO.FAILED);
            return responseDTO;
        }

        responseDTO.setParkingLot(updatedParkingLot);
        responseDTO.setResponseStatus(ResponseStatusDTO.SUCCESS);
        return responseDTO;
    }
}
