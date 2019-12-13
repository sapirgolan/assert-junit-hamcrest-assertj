package model.assertions;

import model.Person;
import org.assertj.core.api.SoftAssertions;

public class MyProjectSoftAssertions extends SoftAssertions {

  public MyPersonAssert assertThat(Person actual) {
    return proxy(MyPersonAssert.class, Person.class, actual);
  }

}
