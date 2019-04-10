package com.epam.travelagency.person;

import com.epam.travelagency.tour.Tour;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * A <code>Customer</code> extends <code>Person</code> object and have additional fileds: {@code *
 * boolean isRegular} - {@code true} if {@code Customer} regular, {@code false} otherwise; {@code
 * int disount} - personal discount for the tours; {@code List<Tour> tours} - list of assigned
 * tours;
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public class Customer extends Person {

  private List<Tour> tours;
  private boolean isRegular;
  private float discount;

  /**
   * Constructs {@code Customer} object with {@code phoneNumber}, {@code lastName},{@code
   * firstName}
   *
   * @param phoneNumber a String
   * @param lastName a String
   * @param firstName a String
   */
  public Customer(String phoneNumber, String lastName, String firstName) {
    super(phoneNumber, lastName, firstName);
  }

  /**
   * Constructs {@code Customer} object
   *
   * @param phoneNumber a String
   * @param lastName a String
   * @param firstName a String
   * @param tours a List of Tour
   * @param isRegular a  boolean
   * @param discount a float
   */
  public Customer(String phoneNumber, String lastName, String firstName,
      List<Tour> tours, boolean isRegular, float discount) {
    super(phoneNumber, lastName, firstName);
    this.tours = tours;
    this.isRegular = isRegular;
    this.discount = discount;
  }

  /**
   * Getter for {@code tours} private field
   *
   * @return {@code List<Tour> tours}
   */
  public List<Tour> getTours() {
    return tours;
  }

  /**
   * Getter for {@code isRegular} private field
   *
   * @return {@code boolean isRegular}
   */
  public boolean isRegular() {
    return isRegular;
  }

  public void setRegular(boolean regular) {
    isRegular = regular;
  }
  /**
   * Getter for {@code discount} private field
   *
   * @return {@code float discount}
   */
  public float getDiscount() {
    return discount;
  }
  /**
   * Setter for {@code discount} private field
   *
   * @param discount a float
   */
  public void setDiscount(float discount) {
    this.discount = discount;
  }

  /**
   * Returns {@code String} representation of Customer object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "Customer{" +
        super.toString() +
        ", tours=" + tours +
        ", isRegular=" + isRegular +
        ", discount=" + discount +
        '}';
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), tours, isRegular, discount);
  }

  public Tour selectTour(String destination, Date startDate, int duration) {
    return null;
  }

  public void pay(Tour tour) {

  }
}
