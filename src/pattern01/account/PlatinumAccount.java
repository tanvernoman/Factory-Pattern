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
public class PlatinumAccount extends BaseAccount {
      private final int platinumTACost=4;

    public PlatinumAccount() {
        super();
    }

   

   
    public int rewardPoints(double amount){
        rewardPoints=(int) Math.round(amount/platinumTACost);
        return rewardPoints;
    }
}
