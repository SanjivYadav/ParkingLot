import com.parkinglot.controller.ParkingLotController;
import com.parkinglot.controller.TicketController;
import com.parkinglot.dtos.*;
import com.parkinglot.factory.ObjectRegistry;
import com.parkinglot.model.*;
import com.parkinglot.repository.ParkingLotRepository;
import com.parkinglot.repository.TicketRepository;
import com.parkinglot.service.ParkingLotService;
import com.parkinglot.service.TicketService;
import com.parkinglot.strategy.spotassignmentstrategy.RandomSpotAssignmentStrategy;

public class Client {
    public static void main(String[] args) {
        ObjectRegistry objectRegistry = new ObjectRegistry();
        objectRegistry.register("ParkingLotRepository", new ParkingLotRepository());
        objectRegistry.register("ParkingLotService",
                new ParkingLotService((ParkingLotRepository)objectRegistry.get("ParkingLotRepository")));
        objectRegistry.register("ParkingLotController",
                new ParkingLotController((ParkingLotService) objectRegistry.get("ParkingLotService")));

        objectRegistry.register("TicketRepository", new TicketRepository());
        objectRegistry.register("RandomSpotAssignmentStrategy", new RandomSpotAssignmentStrategy());
        objectRegistry.register("TicketService", new TicketService((TicketRepository) objectRegistry.get("TicketRepository"),
                (ParkingLotRepository)objectRegistry.get("ParkingLotRepository"),(RandomSpotAssignmentStrategy)objectRegistry.get("RandomSpotAssignmentStrategy")));

        objectRegistry.register("TicketController", new TicketController((TicketService)objectRegistry.get("TicketService")));


        ParkingLotController parkingLotController = (ParkingLotController) objectRegistry.get("ParkingLotController");

        System.out.println(".........create the parking lot................");
        CreateParkingLotRequestDTO request = new CreateParkingLotRequestDTO();
        request.setAddress("Bangalore");
        request.setNoOffloors(4);
        CreateParkingLotResponseDTO responseDTO = parkingLotController.createParkingLot(request);
        if(responseDTO.getResponseStatusDTO().equals(ResponseStatusDTO.FAILED)){
            System.out.println("Something went wrong");
        }
        else {
            System.out.println("Parking lot created at "+ responseDTO.getParkingLot().getAddress()+" is "+ responseDTO.getResponseStatusDTO().name());
        }
        System.out.println(".........update the parking lot................");

        UpdateParkingLotRequestDTO requestDTO = new UpdateParkingLotRequestDTO();
        requestDTO.setId(1);
        requestDTO.setNewAddress("Uttar Pradesh");
        UpdateParkingLotResponseDTO response = parkingLotController.updateParkingLot(requestDTO);
        if(response.getResponseStatus().equals(ResponseStatusDTO.FAILED)){
            System.out.println("Something went wrong unable to update");
        }
        else {
            System.out.println("Parking lot updated to "+ response.getParkingLot().getAddress()+" is "+ response.getResponseStatus().name());
        }

        System.out.println(".........Generate the parking Ticket................");

        TicketController ticketController = (TicketController) objectRegistry.get("TicketController");
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_no(12345);
        vehicle.setVehicleType(VehicleType.SMALL);
        CreateTicketRequestDTO requestTicket = new CreateTicketRequestDTO();
        requestTicket.setParkingLotId(1L);
        requestTicket.setVehicle(vehicle);
        requestTicket.setParkingSpotType(ParkingSpotType.SMALL);
        requestTicket.setParkingEntryGate(new ParkingEntryGate());
        CreateTicketResponseDTO ticketResponseDTO = ticketController.createTicket(requestTicket);
        if(ticketResponseDTO.getResponseStatus().equals(ResponseStatusDTO.FAILED)){
            System.out.println("Something went wrong unable to update");
        }
        else {
            System.out.println("Parking ticket created with id "+ ticketResponseDTO.getParkingTicket().getId()+" is "+ ticketResponseDTO.getResponseStatus().name());
        }



    }
}
