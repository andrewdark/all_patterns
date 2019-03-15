package ua.pp.darknsoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {

    private static final String FIRST_NAME = "Uma";
    private static final String LAST_NAME = "Thurman";
    private static final int AGE = 49;
    private static final int HEIGHT = 180;
    private static final int WEIGHT = 64;

    @Test
    public void test01() {
        Person person = new Person.Builder(FIRST_NAME)
                .withLastName(LAST_NAME)
                .withAge(AGE)
                .withHeight(HEIGHT)
                .withWeith(WEIGHT).build();

        assertNotNull(person);
        assertEquals(FIRST_NAME, person.getFirstName());
        assertEquals(LAST_NAME, person.getLastName());
        assertEquals(AGE, person.getAge());
        assertEquals(HEIGHT, person.getHeight());
        assertEquals(WEIGHT, person.getWeight());

    }

    @Test
    public void test02() {
        Person person = new Person.Builder(FIRST_NAME)
                .withLastName(LAST_NAME)
                .withAge(AGE).build();

        assertNotNull(person);
        assertEquals(FIRST_NAME, person.getFirstName());
        assertEquals(LAST_NAME, person.getLastName());
        assertEquals(AGE, person.getAge());
        assertEquals(0, person.getHeight());
        assertEquals(0, person.getWeight());

    }

    @Test
    public void test03() {
        Person person = new Person.Builder(FIRST_NAME).build();

        assertNotNull(person);
        assertEquals(FIRST_NAME, person.getFirstName());
        assertEquals("", person.getLastName());
        assertEquals(0, person.getAge());
        assertEquals(0, person.getHeight());
        assertEquals(0, person.getWeight());

    }
}
