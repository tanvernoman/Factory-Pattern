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
public class BaseAccount {

    public double balance;
    public int rewardPoints;

    public BaseAccount() {
        this.balance = 0.0;
        this.rewardPoints = 0;
    }

    public int getRewardPoints() {
        return this.rewardPoints;
    }

}
