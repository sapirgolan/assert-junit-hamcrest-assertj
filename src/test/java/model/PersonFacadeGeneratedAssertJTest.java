package model;

import java.util.List;
import model.assertions.generated.PersonAssert;
import org.junit.jupiter.api.Test;

class PersonFacadeGeneratedAssertJTest {

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.2, List.of("Sleep", "eat", "video games"));

    PersonAssert.assertThat(person)
        .hasFirstName("John")
        .hasLastName("Hunter")
        .hasEmail("john.hunter@gmail.com")
        .hasAge(19)
        .hasOnlyHobbies("video games", "Sleep", "eat")
        .hasHobbies("video games")
        .doesNotHaveHobbies("DO HOMEWORK")
        .hasGender('N');
  }
}