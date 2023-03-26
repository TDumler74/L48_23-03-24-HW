package homework;

import homeWork_L47.Circle;
import homeWork_L47.Rectangle;
import homeWork_L47.Shape;
import homeWork_L47.ShapeCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    PersonTest personTest;

    Person john=new Person("John",new Address("Street",1));
    Person karl =new Person("Karl",new Address("Strasse",2));
    Person marie =new Person("Marie",new Address("Berlin",3));
    Person[]people={john,karl,marie};

    List<Person>personList= Arrays.asList(people);

    @BeforeEach
    public void init() {
        personTest = new PersonTest();
    }
    @Test
    public void test_sorted() {
        Person[] expected ={john,karl,marie};
        List<Person>expectedList = Arrays.asList(expected);
        assertArrayEquals(expected,people);
        assertEquals(expectedList,personList);
    }
}
