package model.assertions.generated;

import model.Person;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Person} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractPersonAssert<S extends AbstractPersonAssert<S, A>, A extends Person> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractPersonAssert}</code> to make assertions on actual Person.
   * @param actual the Person we want to make assertions on.
   */
  protected AbstractPersonAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Person's age is equal to the given one.
   * @param age the given age to compare the actual Person's age to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's age is not equal to the given one.
   */
  public S hasAge(int age) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting age of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualAge = actual.getAge();
    if (actualAge != age) {
      failWithMessage(assertjErrorMessage, actual, age, actualAge);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's email is equal to the given one.
   * @param email the given email to compare the actual Person's email to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's email is not equal to the given one.
   */
  public S hasEmail(String email) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting email of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualEmail = actual.getEmail();
    if (!Objects.areEqual(actualEmail, email)) {
      failWithMessage(assertjErrorMessage, actual, email, actualEmail);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's firstName is equal to the given one.
   * @param firstName the given firstName to compare the actual Person's firstName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's firstName is not equal to the given one.
   */
  public S hasFirstName(String firstName) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting firstName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualFirstName = actual.getFirstName();
    if (!Objects.areEqual(actualFirstName, firstName)) {
      failWithMessage(assertjErrorMessage, actual, firstName, actualFirstName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's gender is equal to the given one.
   * @param gender the given gender to compare the actual Person's gender to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's gender is not equal to the given one.
   */
  public S hasGender(char gender) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting gender of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check gender char matches
    char actualGender = actual.getGender();
    if (actualGender != gender) {
      failWithMessage(assertjErrorMessage, actual, gender, actualGender);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies contains the given String elements.
   * @param hobbies the given elements that should be contained in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies does not contain all given String elements.
   */
  public S hasHobbies(String... hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (hobbies == null) failWithMessage("Expecting hobbies parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getHobbies(), hobbies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies contains the given String elements in Collection.
   * @param hobbies the given elements that should be contained in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies does not contain all given String elements.
   */
  public S hasHobbies(java.util.Collection<? extends String> hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (hobbies == null) {
      failWithMessage("Expecting hobbies parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getHobbies(), hobbies.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies contains <b>only</b> the given String elements and nothing else in whatever order.
   * @param hobbies the given elements that should be contained in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies does not contain all given String elements.
   */
  public S hasOnlyHobbies(String... hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (hobbies == null) failWithMessage("Expecting hobbies parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getHobbies(), hobbies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
   * @param hobbies the given elements that should be contained in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies does not contain all given String elements.
   */
  public S hasOnlyHobbies(java.util.Collection<? extends String> hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (hobbies == null) {
      failWithMessage("Expecting hobbies parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getHobbies(), hobbies.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies does not contain the given String elements.
   *
   * @param hobbies the given elements that should not be in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies contains any given String elements.
   */
  public S doesNotHaveHobbies(String... hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (hobbies == null) failWithMessage("Expecting hobbies parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getHobbies(), hobbies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person's hobbies does not contain the given String elements in Collection.
   *
   * @param hobbies the given elements that should not be in actual Person's hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies contains any given String elements.
   */
  public S doesNotHaveHobbies(java.util.Collection<? extends String> hobbies) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (hobbies == null) {
      failWithMessage("Expecting hobbies parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getHobbies(), hobbies.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Person has no hobbies.
   * @return this assertion object.
   * @throws AssertionError if the actual Person's hobbies is not empty.
   */
  public S hasNoHobbies() {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have hobbies but had :\n  <%s>";

    // check
    if (actual.getHobbies().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getHobbies());
    }

    // return the current assertion for method chaining
    return myself;
  }


  /**
   * Verifies that the actual Person's lastName is equal to the given one.
   * @param lastName the given lastName to compare the actual Person's lastName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Person's lastName is not equal to the given one.
   */
  public S hasLastName(String lastName) {
    // check that actual Person we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLastName = actual.getLastName();
    if (!Objects.areEqual(actualLastName, lastName)) {
      failWithMessage(assertjErrorMessage, actual, lastName, actualLastName);
    }

    // return the current assertion for method chaining
    return myself;
  }

}