/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern01.account;

/**
 *
 * @author 1410453
 */
public class GoldAccount extends BaseAccount{
     private final int goldTACost=8;

    public GoldAccount() {
        super();
    }

   
    public int rewardPoints(double amount){
        rewardPoints=(int) Math.round(amount/goldTACost);
        return rewardPoints;
    }
}
