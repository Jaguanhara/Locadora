/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Jaguanhara Neto
 */
abstract class Price {

    double getCharge;
   //abstract Double getPriceCode();

    double getCharge(int daysRented) {
        double thisAmount = 0;
        //determine amounts for aRental line
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    int getPriceCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
class ChildrensPrice extends Price {
    int getPriceCode() {
       return Movie.CHILDRENS;
   }
}
 
class NewReleasePrice extends Price {
    int getPriceCode() {
       return Movie.NEW_RELEASE;
   }
}
 
class RegularPrice extends Price {
    int getPriceCode() {
       return Movie.REGULAR;
   }
}