package model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonFacadeAssertJTest {

  @Test
  void whenAgeAndGenderAreNotSent_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com");
    Assertions.assertAll(
        () -> assertThat(person.getFirstName()).isEqualTo("John"),
        () -> assertThat(person.getLastName()).isEqualToIgnoringCase("hunters"),
        () -> assertThat(person.getEmail()).isNotEqualToIgnoringCase("@@"),
        () -> assertThat(person.getAge()).isBetween(17, 19),
        () -> assertThat(person.getGender()).isEqualTo("N"),
        () -> assertThat(person.getHobbies()).isEmpty()
    );
  }

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.2, List.of("Sleep", "eat", "video games"));

    assertThat(person.getFirstName()).isEqualTo("John");
    assertThat(person.getLastName()).isEqualToIgnoringCase("hunter");
    assertThat(person.getEmail())
        .isNotEqualToIgnoringCase("@@")
        .contains("john.hunter");
    assertThat(person.getAge()).isBetween(17, 19);
    assertThat(person.getGender()).isEqualTo('N');
    assertThat(person.getHobbies())
        .isNotEmpty()
        .containsExactly("Sleep", "eat", "video games")
        .containsOnly("video games", "Sleep", "eat")
        .doesNotContain("DO HOMEWORK");
  }
}