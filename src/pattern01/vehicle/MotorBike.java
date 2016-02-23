/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern01.vehicle;

/**
 *
 * @author 1410453
 */
public class MotorBike extends Vehicle {

    private final int motorbickRoadTax = 6;

    public MotorBike() {
        super();
    }

    public int roadTax(double year) {
        roadTax = (int) Math.round(motorbickRoadTax * year);
        return roadTax;
    }
}
