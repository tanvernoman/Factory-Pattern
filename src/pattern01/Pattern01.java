/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern01;

import factory.AccountFactory;
import factory.AccountI;
import pattern01.account.BronzeAccount;
import pattern01.account.GoldAccount;
import pattern01.account.PlatinumAccount;
import pattern01.account.SilverAccount;
import pattern01.vehicle.Car;
import pattern01.vehicle.Lory;

/**
 *
 * @author 1410453
 */
public class Pattern01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            AccountI silver = AccountFactory.createAccount("Silver");
            System.out.println("Silver account : " + silver.addRewardPoints(123.00));

            AccountI thegolden = AccountFactory.createAccount("Gold");
            System.out.println("Gold account : " + thegolden.addRewardPoints(123.00));

            AccountI anotherPlatinum = AccountFactory.createAccount("Platinum");
            System.out.println("Platinum account : " + anotherPlatinum.addRewardPoints(123.00));

            

            System.out.println(" \n-----add som ereward points -------");
            silver.addRewardPoints(234.56);
            System.out.println("Silver: reward point added ");

            thegolden.addRewardPoints(234.56);
            System.out.println("thegolden: reward point added");

            anotherPlatinum.addRewardPoints(234.56);
            System.out.println("anotherplatinum : reward point added ");

           // System.out.println("\n ------use the getter mehtod (see ACCOUNT BASE)");

            System.out.println("[use getter method] silver (rewardPoints) :" + silver.getRewardPoints());
            System.out.println("[use getter method] thegolden (rewardPoints) :" + thegolden.getRewardPoints());
            System.out.println("[use getter method] platinum (rewardPoints) :" + anotherPlatinum.getRewardPoints());
            
            //makes the program crash if 
            System.out.println("\n---------Crash the program --------------");
            AccountI crash = AccountFactory.createAccount("Pla");
            System.out.println("Platinum account : " + crash.addRewardPoints(123.00));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception: " + e.getMessage());
        }
        System.out.println("\n ---------end of the program-------------");

    }

    public static void onleClass() {
        Account ac01 = new Account("silver");
        ac01.rewardPoints(123.00);
        System.out.println("Silver account : " + ac01.getRewardPoints());

        Account ac02 = new Account("gold");
        ac02.rewardPoints(123.00);
        System.out.println("Gold account : " + ac02.getRewardPoints());

        Account ac03 = new Account("platinum");
        ac03.rewardPoints(123.00);
        System.out.println("Platinum account : " + ac03.getRewardPoints());
    }

    public static void superAndSubClassws() {

        SilverAccount acsilver = new SilverAccount();
        acsilver.rewardPoints(123.00);
        System.out.println("silver account extend Base Account " + acsilver.getRewardPoints());

        GoldAccount acgold = new GoldAccount();
        acgold.rewardPoints(123.00);
        System.out.println("Gold account extend Base Account " + acgold.getRewardPoints());

        PlatinumAccount acplatinum = new PlatinumAccount();
        acplatinum.rewardPoints(123.00);
        System.out.println("Platinum account extend Base Account " + acplatinum.getRewardPoints());

        BronzeAccount acbronze = new BronzeAccount();
        acbronze.rewardPoints(123.00);
        System.out.println("Bronze account extend Base Account " + acbronze.getRewardPoints());

        Lory l = new Lory();
        l.roadTax(5);
        System.out.println("road tax for lory : " + l.getRoadTax());

    }

}
