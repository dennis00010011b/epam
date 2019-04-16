package com.epam.travelagency.tour;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ShoppingTour extends Tour {

  private List<String> shops;

  /**
   * Constructs {@code ShoppingTour} object
   *
   * @param id a int
   * @param price a float
   * @param startDate a Date
   * @param endDate a Date
   * @param rating a byte
   * @param isHot a boolean
   * @param shops is a List of shops
   */
  public ShoppingTour(int id, float price, Date startDate, Date endDate,
      byte rating, boolean isHot, List<String> shops) {
    super(id, price, startDate, endDate, rating, isHot);
    this.shops = shops;
  }

  /**
   * Returns {@code String} representation of ShoppingTour object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "ShoppingTour{" +
        super.toString() +
        ", shops=" + shops +
        '}';
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), shops);
  }
}
