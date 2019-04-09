package com.epam.travelagency.person;

import com.epam.travelagency.agency.TravelAgency;
import com.epam.travelagency.tour.Tour;
import java.util.List;
import java.util.Objects;

public class Agent extends Person {

  public List<TravelAgency> travelAgency;

  public Agent(String phoneNumber, String lastName, String firstName,
      List<TravelAgency> travelAgency) {
    super(phoneNumber, lastName, firstName);
    this.travelAgency = travelAgency;
  }

  public void setHotTour(Tour tour) {

  }

  public void setDiscount(Customer customer) {

  }


}
