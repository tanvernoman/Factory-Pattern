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
public class Lory extends Vehicle {
        private final int loryRoadTax=5;

    public Lory() {
        super();
    }

    public int roadTax(double year){
        roadTax=(int) Math.round(loryRoadTax*year);
        return roadTax;
    }
}
