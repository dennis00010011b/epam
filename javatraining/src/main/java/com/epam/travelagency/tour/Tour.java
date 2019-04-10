package com.epam.travelagency.tour;

import java.util.Date;
import java.util.Objects;

/**
 * A <code>Tour</code> abstract class describes travel tour destination parameter implemented in
 * inheritant classes
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public abstract class Tour {

  private int id;
  private float price;
  private Date startDate;
  private Date endDate;
  private byte rating;
  private boolean isHot;

  /**
   * Constructs {@code Tour} object
   *
   * @param id a int
   * @param price a float
   * @param startDate a Date
   * @param endDate a Date
   * @param rating a byte
   * @param isHot a boolean
   */
  public Tour(int id, float price, Date startDate, Date endDate, byte rating, boolean isHot) {
    this.id = id;
    this.price = price;
    this.startDate = startDate;
    this.endDate = endDate;
    this.rating = rating;
    this.isHot = isHot;
  }
  /**
   * Getter for {@code id} private field
   *
   * @return {@code int id}
   */
  public int getId() {
    return id;
  }
  /**
   * Setter for {@code id} private field
   *
   * @param id an int
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Getter for {@code isHot} private field
   *
   * @return {@code true} if tour is last minute(hot), otherwise returns {@code false}
   */
  public boolean isHot() {
    return isHot;
  }

  /**
   * Setter for {@code isHot} private field
   *
   * @param hot a boolean
   */
  public void setHot(boolean hot) {
    isHot = hot;
  }

  /**
   * Getter for {@code price} private field
   *
   * @return {@code float price}
   */
  public float getPrice() {
    return price;
  }

  /**
   * Setter for {@code price} private field
   *
   * @param price a float
   */
  public void setPrice(float price) {
    this.price = price;
  }

  /**
   * Getter for {@code startDate} private field
   *
   * @return {@code Date startDate}
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Setter for {@code startDate} private field
   *
   * @param startDate a Date
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for {@code endDate} private field
   *
   * @return {@code Date endDate}
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Setter for {@code endDate} private field
   *
   * @param endDate a Date
   */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Getter for {@code rating} private field
   *
   * @return {@code byte rating}
   */
  public byte getRating() {
    return rating;
  }

  /**
   * Setter for {@code rating} private field
   *
   * @param rating a byte
   */
  public void setRating(byte rating) {
    this.rating = rating;
  }
}
