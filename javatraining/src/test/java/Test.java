import com.epam.travelagency.person.Agent;
import com.epam.travelagency.person.Customer;
import com.epam.travelagency.person.Person;
import com.epam.travelagency.tour.Tour;

public class Test {

  public static void main(String[] args) {

    Person ivanov = new Person("123123","Ivanov","212-34-56");
    Person petrov = new Customer("123123","Petrov","212-34-56");
    System.out.println(petrov.getLastName());
    System.out.println(petrov.getFirstName());
    System.out.println(petrov.getPhoneNumber());

    System.out.println(ivanov.hashCode());
    System.out.println(petrov);
    System.out.println(petrov.hashCode());

    //Agent agent = new Agent("123123","Ivanov","212-34-56");


  }

}

