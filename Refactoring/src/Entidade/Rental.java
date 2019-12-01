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
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
    }
    public int getDaysRented() {
      return _daysRented;
    }
    public Movie getMovie() {
      return _movie;
    }

    double getCharge() {
        double thisAmount = 0;
        //determine amounts for aRental line
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (this.getDaysRented() > 2) {
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += this.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (this.getDaysRented() > 3) {
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    int getFrequentRenterPoints(int frequentRenterPoints) {
        // add frequent renter points
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
    
}
