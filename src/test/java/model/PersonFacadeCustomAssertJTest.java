package model;

import java.util.List;
import model.assertions.MyPersonAssert;
import org.junit.jupiter.api.Test;

class PersonFacadeCustomAssertJTest {

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.2, List.of("Sleep", "eat", "video games"));

    MyPersonAssert.assertThat(person)
        .firstNameIs("John")
        .lastNameIs("Hunter")
        .emailDomainIs("Gmail")
        .emailAddressIs("john.hunter@gmail.com")
        .ageIs(19)
        .hobbiesContains("video games")
        .hobbiesAre("video games", "Sleep", "eat");
  }
}