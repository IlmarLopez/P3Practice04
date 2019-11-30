package p3practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Hotel implements Lodge{
    private String hotelName;
    private int hotelId;
    private int totalRooms;
    private int availableRooms;
    protected double nightCharge;
    protected double clientAccount = 0;
    private List<String> listRoomsAvailable = new ArrayList<>();
    private List<String> listRoomsOccupied = new ArrayList<>();
    private List<String> listRoomsLodgeByClient = new ArrayList<>();
    
    public Hotel(String hotelName, int hotelId, int totalRooms, double nightCharge, String[] roomsOccupied){
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.totalRooms = totalRooms;
        this.nightCharge = nightCharge;
        this.listRoomsOccupied.addAll(Arrays.asList(roomsOccupied));
        this.availableRooms = totalRooms - roomsOccupied.length;

        if (hotelId == 1) {
            for (var i = 1; i <= totalRooms; i++)
                if (!this.listRoomsOccupied.contains("M"+Integer.toString(i))) {
                    this.listRoomsAvailable.add("M"+Integer.toString(i));
                }
        } else if (hotelId == 2) {
            for (var i = 1; i <= totalRooms; i++)
                if (!this.listRoomsOccupied.contains("CE" + String.format("%02d", i))) {
                    this.listRoomsAvailable.add("CE" + String.format("%02d", i));
                }
        }
       
    }
    
    private void checkingRoomStatus(){
        //Completar con su logica
    }
    
    public Boolean checkIfRoomAvailable(int room){
        try {
            this.listRoomsAvailable.get(room);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
    
    public void printHotelStatus(){
        System.out.println("Hotel : " + this.hotelName);
        System.out.println("Total Rooms : " + this.totalRooms);
        System.out.println("Total Rooms Available : " + this.availableRooms);
        System.out.println("Total Rooms Occupied : " + this.listRoomsOccupied.size());
        System.out.println("Rooms Available : " + this.listRoomsAvailable.toString());
        System.out.println("Rooms Occupied : " + this.listRoomsOccupied.toString());
        System.out.println("Night Cost : " + this.nightCharge);
    }
    
    public void checkBalance() { 
        System.out.println("Your current balance is : $ " + this.clientAccount);
    }
    
    @Override
    public String lodgeRoom(int days) {
        //Completar con su logica
        return "hi";
    }
    
    @Override
    public double checkOut(){
        //Completar con su logica
        return 45;
    }
}