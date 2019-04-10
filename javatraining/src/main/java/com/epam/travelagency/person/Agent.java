package com.epam.travelagency.person;

import com.epam.travelagency.agency.TravelAgency;
import com.epam.travelagency.tour.Tour;
import com.epam.travelagency.tour.Tourable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * A <code>Agent</code> extends <code>Person</code> object and have additional fileds: {@code
 * List<TravelAgency> travelAgencies} - list of travel agencies where agent is employed
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public class Agent extends Person implements Tourable {

  public List<TravelAgency> travelAgencies;

  /**
   * Constructs {@code Agent} object with {@code phoneNumber}, {@code lastName},{@code firstName}
   *
   * @param phoneNumber a String
   * @param lastName a String
   * @param firstName a String
   */
  public Agent(String phoneNumber, String lastName, String firstName) {
    super(phoneNumber, lastName, firstName);
  }

  /**
   * Constructs {@code Customer} object
   *
   * @param phoneNumber a String
   * @param lastName a String
   * @param firstName a String
   * @param travelAgencies a List of TravelAgency
   */
  public Agent(String phoneNumber, String lastName, String firstName,
      List<TravelAgency> travelAgencies) {
    super(phoneNumber, lastName, firstName);
    this.travelAgencies = travelAgencies;
  }

  /**
   * Returns {@code String} representation of Agent object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "Agent{" +
        super.toString() +
        " ,travelAgencies=" + travelAgencies +
        '}';
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), travelAgencies);
  }

  /**
   * Find Tour object with given parameters
   *
   * @param destination a String
   * @param startDate a Date
   * @return {@code Tour}
   */
  public Tour findTour(String destination, Date startDate) {
    return null;
  }

  /**
   * Assign <tt> Hot </tt> status to a Tour object
   *
   * @param tour a Tour
   */
  public void setHotTour(Tour tour) {

  }

  /**
   * Set personal discount for the Customer
   *
   * @param customer a Customer
   */
  public void setDiscountCustomer(Customer customer) {

  }

  /**
   * Set the Customer as a regular customer
   *
   * @param customer a Customer
   */
  public void setRegularCustomer(Customer customer) {

  }

  /**
   * send the bill to the customer
   *
   * @param amount a float
   * @param customer a Customer
   */
  public void sendBill(float amount, Customer customer) {

  }

}
