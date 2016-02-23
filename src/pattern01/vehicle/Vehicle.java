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
public class Vehicle {
    
    public double startYear;
    public int roadTax;

    public Vehicle() {
        this.startYear=0.0;
        this.roadTax=0;
    }
    
    public int getRoadTax(){
        return this.roadTax;
    }
    
}
