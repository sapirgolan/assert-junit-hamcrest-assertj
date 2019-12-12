package model;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonFacadeHamcrestAssertTest {

  @Test
  void whenAgeAndGenderAreNotSent_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com");
    Assertions.assertAll(
        () -> assertThat(person.getFirstName(), equalTo("John")),
        () -> assertThat(person.getLastName(), equalToIgnoringCase("hunters")),
        () -> assertThat(person.getEmail(), is("john.hunter@gmail.com")),
        () -> assertThat(person.getAge(), is(equalTo(Integer.MAX_VALUE))),
        () -> assertThat(person.getHobbies(), is(empty())),
        () -> assertThat(person.getGender(), is(("N")))
    );
  }

  @Test
  void whenAgeIsDoubleAndGenderNotSet_defaultAreUsed() {
    Person person = PersonFacade.of("John", "Hunter", "john.hunter@gmail.com", 18.2, List.of("Sleep", "eat", "video games"));
    assertThat(person.getAge(), allOf(equalTo(19), greaterThan(18), lessThanOrEqualTo(19)));
    assertThat(person.getFirstName(), equalTo("John"));
    assertThat(person.getLastName(), equalToIgnoringCase("hunter"));
    assertThat(person.getEmail(), is("john.hunter@gmail.com"));
    assertThat(person.getGender(), is(('N')));
    assertThat(person.getHobbies(), containsInAnyOrder("eat", "Sleep", "video games"));
    assertThat(person.getHobbies(), hasItems("video games"));
    assertThat(person.getHobbies(), not(hasItem("DO HOMEWORK")));
  }
}