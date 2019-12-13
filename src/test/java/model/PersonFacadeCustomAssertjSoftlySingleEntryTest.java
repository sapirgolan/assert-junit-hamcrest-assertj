package model;

import static model.assertions.MyProjectAssertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import model.assertions.MyProjectSoftAssertions;
import org.junit.jupiter.api.Test;

class PersonFacadeCustomAssertjSoftlySingleEntryTest {

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

  @Test
  void whenAgeAndGenderAreNotSent_defaultAreUsed_softly() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com");

    MyProjectSoftAssertions softly = new MyProjectSoftAssertions();

    softly.assertThat(person)
        .firstNameIs("John")
        .lastNameIs("hunters")
        .emailAddressIs("john.hunter@gmail.com")
        .ageIs(17)
        .hobbiesContains("Play Fifa 2020");

    softly.assertAll();
  }
}