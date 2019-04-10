package com.epam.travelagency.tour;

import java.util.Date;
import java.util.Objects;

/**
 * A <code>ResortTour</code> class describes travel tour with one destination
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public class ResortTour extends Tour {

  private String destination;

  /**
   * Constructs {@code ResortTour} object
   *
   * @param id a int
   * @param price a float
   * @param startDate a Date
   * @param endDate a Date
   * @param rating a byte
   * @param isHot a boolean
   * @param destination a String
   */
  public ResortTour(int id, float price, Date startDate, Date endDate,
      byte rating, boolean isHot, String destination) {
    super(id, price, startDate, endDate, rating, isHot);
    this.destination = destination;
  }

  /**
   * Getter for {@code destination} private field
   *
   * @return {@code String destination}
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for {@code destination} private field
   *
   * @param destination a String
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Returns {@code String} representation of ResortTour object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "ResortTour{" +
        super.toString() +
        ", destination='" + destination + '\'' +
        '}';
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), destination);
  }
}
