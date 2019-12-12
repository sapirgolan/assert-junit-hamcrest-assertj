package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class PersonFacadeJunitAssertTest {

  @Test
  void whenAgeAndGenderAreNotSent_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com");
    assertAll(
        () -> assertEquals("John", person.getFirstName()),
        () -> assertTrue("hunters".equalsIgnoreCase(person.getLastName())),
        () -> assertEquals("john.hunter@gmail.com", person.getEmail()),
        () -> assertEquals(Integer.MAX_VALUE, person.getAge()),
        () -> assertEquals("N", person.getGender()),
        () -> assertTrue(person.getHobbies().isEmpty())
    );
  }

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    List<String> hobbies = List.of("Sleep", "eat", "video games");
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.8, hobbies);
    assertAll(
        () -> assertEquals(19, person.getAge()),
        () -> assertEquals("John", person.getFirstName()),
        () -> assertTrue("hunter".equalsIgnoreCase(person.getLastName())),
        () -> assertEquals("john.hunter@gmail.com", person.getEmail()),
        () -> assertEquals('N', person.getGender()),
        () -> assertArrayEquals(new String[] {"Sleep", "eat", "video games"}, person.getHobbies().toArray()),
        () -> assertEquals(hobbies.toArray(), person.getHobbies().toArray())
    );
  }
}