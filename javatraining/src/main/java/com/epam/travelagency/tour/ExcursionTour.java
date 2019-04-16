package com.epam.travelagency.tour;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ExcursionTour extends Tour {

  private List<String> destinations;
  private List<String> showplaces;

  /**
   * Constructs {@code ShoppingTour} object
   *
   * @param id a int
   * @param price a float
   * @param startDate a Date
   * @param endDate a Date
   * @param rating a byte
   * @param isHot a boolean
   * @param destinations is a List of cities
   * @param showplaces is a List of showplaces
   */
  public ExcursionTour(int id, float price, Date startDate, Date endDate,
      byte rating, boolean isHot, List<String> destinations,
      List<String> showplaces) {
    super(id, price, startDate, endDate, rating, isHot);
    this.destinations = destinations;
    this.showplaces = showplaces;
  }

  /**
   * Returns {@code String} representation of ExcursionTour object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "ExcursionTour{" +
        super.toString() +
        ", destinations=" + destinations +
        ", showplaces=" + showplaces +
        '}';
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), destinations, showplaces);
  }
}
