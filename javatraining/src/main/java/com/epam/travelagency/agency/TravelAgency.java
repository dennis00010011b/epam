package com.epam.travelagency.agency;

import com.epam.travelagency.person.Agent;
import com.epam.travelagency.person.Customer;
import com.epam.travelagency.tour.Tour;
import java.util.List;
import java.util.Objects;

/**
 * Class describes travel agency: contains agents, tours, customers
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public class TravelAgency {

  private int id;
  private List<Agent> agents;
  private List<Customer> customers;
  private List<Tour> tours;

  /**
   * Constructs {@code Person} object with {@code phoneNumber}, {@code lastName},{@code firstName}
   *
   * @param agents a List of Agent
   * @param customers a List of Customers
   * @param tours a List of Tours
   */
  public TravelAgency(int id, List<Agent> agents,
      List<Customer> customers, List<Tour> tours) {
    this.id = id;
    this.agents = agents;
    this.customers = customers;
    this.tours = tours;
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
   * @param id a int
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Getter for {@code agents} private field
   *
   * @return {@code List<Agent> agents}
   */
  public List<Agent> getAgents() {
    return agents;
  }

  /**
   * Setter for {@code agents} private field
   *
   * @param agents a List<Agent>
   */
  public void setAgents(List<Agent> agents) {
    this.agents = agents;
  }

  /**
   * Getter for {@code customers} private field
   *
   * @return {@code List<Customer> customers}
   */
  public List<Customer> getCustomers() {
    return customers;
  }

  /**
   * Setter for {@code customers} private field
   *
   * @param customers a List<Customer>
   */
  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
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
   * Setter for {@code tours} private field
   *
   * @param tours a List<Tour>
   */
  public void setTours(List<Tour> tours) {
    this.tours = tours;
  }

  /**
   * @return the hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(agents, customers, tours);
  }

  /**
   * Returns {@code String} representation of TravelAgency object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "TravelAgency{" +
        "agents=" + agents +
        ", customers=" + customers +
        ", tours=" + tours +
        '}';
  }
}
