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
public class Movie {
  
  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price; 
 

  public Movie(String title, int priceCode) {
      _title = title;
      setPrice(priceCode);
  }

  public int getPrice() {
      return _price.getPriceCode();
  }

  public void setPrice(int arg) {
     switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
  }

  public String getTitle (){
      return _title;
  }

double getCharge(int daysRented) {
      return _price.getCharge;
}
  
  
    int getFrequentRenterPoints(int daysRented) {
        // add frequent renter points
        // add bonus for a two day new release rental
        if ((getPrice() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 1;
        }
        return 2;
    }
}
    

