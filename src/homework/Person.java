package homework;

import java.util.Comparator;
import java.util.List;

public class Person {

    String name;
    Address addresses;


    public Person(String name, Address addresses) {

        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public Address getAddresses() {

        return addresses;
    }

    public List<Address> getAddresses(List<Address> persons) {

        return getAddresses(persons);
    }
    @Override
    public String toString() {
        return "{" + name + ": " + addresses + '}';
    }

}