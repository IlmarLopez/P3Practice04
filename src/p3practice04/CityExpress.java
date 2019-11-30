package p3practice04;

public class CityExpress extends Hotel {
    private double miniBarCharge = 500.00;
    private double dinnerService = 350.00;
    
    public CityExpress(){
        super("CityExpress Tijuana", 2, 10, 1900.50, new String[]{ "CE01", "CE05", "CE06"});
    }
    
    public void openMinibar(){
        clientAccount += miniBarCharge;
    }
    
    public void orderDinnerService(){
        clientAccount += dinnerService;
    }
}
