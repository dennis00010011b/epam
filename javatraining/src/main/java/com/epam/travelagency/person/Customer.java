package com.epam.travelagency.person;

import com.epam.travelagency.tour.Tour;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Customer extends Person {

  public List<Tour> tours;
  private boolean isRegular;
  private int discount;

  public Customer(String phoneNumber, String lastName, String firstName) {
    super(phoneNumber, lastName, firstName);
  }

  public Customer(String phoneNumber, String lastName, String firstName,
      List<Tour> tours, boolean isRegular, int discount) {
    super(phoneNumber, lastName, firstName);
    this.tours = tours;
    this.isRegular = isRegular;
    this.discount = discount;
  }

  public Tour selectTour(String destination, Date startDate, int duration) {
    return null;
  }

  public void pay(Tour tour) {

  }


}
