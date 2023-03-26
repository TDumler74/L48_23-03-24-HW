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

    public List<Address> getAddresses(List<Address> persons) {

        return getAddresses(persons);
    }

    public boolean compareTo(Address o) {
        return o.street.equals(o);
    }


    @Override
    public String toString() {
        return "Person {" + name + ": " + addresses + '}';
    }

}