package p3practice04;

public class Main {
    public static void main(String[] args) {
        Marriot marriot = new Marriot();
        marriot.lodgeRoom(3);
        marriot.openMinibar();
        marriot.checkBalance();
        marriot.printHotelStatus();
        marriot.checkOut();
        
        CityExpress cityExpress = new CityExpress();
        cityExpress.lodgeRoom(3);
        cityExpress.openMinibar();
        cityExpress.orderDinnerService();
        cityExpress.checkBalance();
        cityExpress.printHotelStatus();
        cityExpress.checkOut();
    }    
}
