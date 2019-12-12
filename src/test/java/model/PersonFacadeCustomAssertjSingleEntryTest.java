package model;

import static model.assertions.MyProjectAssertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class PersonFacadeCustomAssertjSingleEntryTest {

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.2, List.of("Sleep", "eat", "video games"));

    assertThat(person)
        .firstNameIs("John")
        .lastNameIs("Hunter")
        .emailDomainIs("Gmail")
        .emailAddressIs("john.hunter@gmail.com")
        .ageIs(19)
        .hobbiesContains("video games")
        .hobbiesAre("video games", "Sleep", "eat");

    assertThat("hunter").isEqualTo("hunter");
  }
}