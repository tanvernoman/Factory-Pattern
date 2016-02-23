/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author 1410453
 */
public class AccountFactory {

    public AccountFactory() {
    }

    public static AccountI createAccount(String actype) {
        if (actype.equalsIgnoreCase("Silver")) {
            return new SilverAccount();

        } else if (actype.equalsIgnoreCase("Gold")) {
            return new GoldAccount();
        } else if (actype.equalsIgnoreCase("Platinum")) {
            return new PlatinumAccount();
        }

        throw new IllegalArgumentException("Can not create a '" + actype + "' account!");
        // if the stirng actype does not contain a valid account type name
    }

}
