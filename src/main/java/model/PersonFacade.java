package model;

import java.util.Collection;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PersonFacade {

  public Person of(String firstName, String lastName, String email) {
    return Person.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .build();
  }

  public Person of(String firstName, String lastName, String email, int age) {
    return Person.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .age(age)
        .build();
  }

  public Person of(String firstName, String lastName, String email, double age, Collection<String> hobbies) {
    return Person.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .age((int) Math.ceil(age))
        .hobbies(hobbies)
        .build();
  }

  public Person of(String firstName, String lastName, String email, char gender) {
    return Person.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .gender(gender)
        .build();
  }

  public Person of(String firstName, String lastName, String email, int age, char gender) {
    return Person.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .age(age)
        .gender(gender)
        .build();
  }
}
