package com.epam.travelagency.person;

import com.epam.travelagency.agency.TravelAgency;
import com.epam.travelagency.tour.Tour;
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
public class Agent extends Person {

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

  public void setHotTour(Tour tour) {

  }

  public void setDiscount(Customer customer) {

  }


}
