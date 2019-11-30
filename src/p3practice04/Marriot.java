/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3practice04;

/**
 *
 * @author developer
 */
public class Marriot extends Hotel {
    private double miniBarCharge = 450.00;
    
    public Marriot(){
        super("Marriot Tijuana", 1, 10, 1450.25, new String[]{"M7", "M4", "M3", "M9"});
    }
    
    public void openMinibar(){
        clientAccount += miniBarCharge;
    }
}
