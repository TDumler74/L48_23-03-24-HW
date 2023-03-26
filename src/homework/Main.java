package homework;
//Задача*
//Есть два класса: Address с полями String street и int houseNumber и Person с полями String name и Address address.
// Нужно написать метод List< Address > getAddresses(List <Person>person)
// то есть по списку persons метод
// будет возвращать список их адресов.
// Протестировать его.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> person= new ArrayList<>();
        person.add(new Person("John", new Address("Berliner Str.", 1)));
        person.add(new Person("Marie", new Address("Dresdener Str.", 2)));
        person.add(new Person("Peter",new Address("Bielefelder Str.",10)));
        person.add(new Person("Claudia",new Address("Bielefelder Str.",10)));

        System.out.println(person);
        System.out.println();
        List<Address>addressList=new ArrayList<>();
        for (Person person1:person){
            addressList.add((Address) person1.addresses);
        }
        System.out.println(addressList);
    }
//[Person {John {Berliner Str.1}}, Person {Marie {Dresdener Str.2}}, Person {Peter {Bielefelder Str.10}}, Person {Claudia {Bielefelder Str.10}}]

//[{Berliner Str.1}, {Dresdener Str.2}, {Bielefelder Str.10}, {Bielefelder Str.10}]


}
