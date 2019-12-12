package model.assertions;

import lombok.experimental.UtilityClass;
import model.Person;

@UtilityClass
public class MyProjectAssertions {

  // give access to PersonAssert assertion
  public static MyPersonAssert assertThat(Person actual) {
    return new MyPersonAssert(actual);
  }

}
