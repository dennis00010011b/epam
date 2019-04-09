package com.epam.travelagency.person;

import java.util.Objects;

/**
 * A <code>Person</code> object represent an individual human with last name, first name and unique
 * phone number
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public class Person {

  private String phoneNumber;
  private String lastName;
  private String firstName;

  /**
   * Constructs {@code Person} object with {@code phoneNumber}, {@code lastName},{@code firstName}
   *
   * @param phoneNumber a String
   * @param lastName a String
   * @param firstName a String
   */
  public Person(String phoneNumber, String lastName, String firstName) {
    this.phoneNumber = phoneNumber;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  /**
   * Getter for {@code phoneNumber} private field
   *
   * @return {@code phoneNumber}
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Setter for {@code phoneNumber} private field
   *
   * @param phoneNumber a String
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Getter for {@code lastName} private field
   *
   * @return {@code lastName}
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for {@code lastName} private field
   *
   * @param lastName a String
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for {@code firstName} private field
   *
   * @return {@code firstName}
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for {@code firstName} private field
   *
   * @param firstName a String
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Returns {@code String} representation of Person object
   *
   * @return the result of calling {@code toString} for a non-{@code null} argument and {@code
   * "null"} for a {@code null} argument
   */
  @Override
  public String toString() {
    return "Person{" +
        "phoneNumber='" + phoneNumber + '\'' +
        ", lastName='" + lastName + '\'' +
        ", firstName='" + firstName + '\'' +
        '}';
  }

  /**
   * Compare two Person's objects
   *
   * @param o an object
   * @return {@code true} if both objects have all fields with the same values and {@code false}
   * otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(phoneNumber, person.phoneNumber) &&
        Objects.equals(lastName, person.lastName) &&
        Objects.equals(firstName, person.firstName);
  }

  /**
   * @return he hash code of a non-{@code null} argument and 0 for a {@code null} argument
   * @see Object#hashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, lastName, firstName);
  }
}
