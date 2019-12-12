package model.assertions;

import java.util.Objects;
import model.Person;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class MyPersonAssert extends AbstractAssert<MyPersonAssert, Person> {

  public MyPersonAssert(Person actuall) {
    super(actuall, MyPersonAssert.class);
  }

  public static MyPersonAssert assertThat(Person actual) {
    return new MyPersonAssert(actual);
  }

  public MyPersonAssert firstNameIs(String firstName) {
    isNotNull();

    Assertions.assertThat(actual.getFirstName()).isEqualTo(firstName);

    return this;
  }

  public MyPersonAssert lastNameIs(String lastName) {
    isNotNull();

    Assertions.assertThat(actual.getLastName()).isEqualTo(lastName);

    return this;
  }

  public MyPersonAssert emailDomainIs(String expectedDomain) {
    isNotNull();

    String actualDomain = StringUtils.substringBetween(actual.getEmail(), "@", ".");
    if (!Objects.equals(actualDomain, expectedDomain)) {
      failWithMessage("Expected domain name to be <%s> but was <%s>", expectedDomain, actualDomain);
    }
    return this;
  }

  public MyPersonAssert emailAddressIs(String emailAddress) {
    isNotNull();

    Assertions.assertThat(actual.getEmail()).isEqualTo(emailAddress);
    return this;
  }

  public MyPersonAssert ageIs(int age) {
    isNotNull();
    Assertions.assertThat(actual.getAge()).isEqualTo(age);
    return this;
  }

  public MyPersonAssert hobbiesContains(String hobby) {
    isNotNull();
    Assertions.assertThat(actual.getHobbies()).contains(hobby);

    return this;
  }

  public MyPersonAssert hobbiesAre(String... hobbies) {
    isNotNull();
    Assertions.assertThat(actual.getHobbies()).containsOnly(hobbies);

    return this;
  }
}
