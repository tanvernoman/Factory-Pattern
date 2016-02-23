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
public class Car extends Vehicle {

    private final int carRoadTax = 8;

    public Car() {
        super();
    }

    public int roadTax(double year) {
        roadTax = (int) Math.round(carRoadTax * year);
        return roadTax;
    }

}
