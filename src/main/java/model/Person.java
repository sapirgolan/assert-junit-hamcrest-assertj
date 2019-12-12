package model;

import static java.util.Collections.emptyList;

import java.util.Collection;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Value;

@Value
@Builder(access = AccessLevel.PACKAGE)
public class Person {
  final String firstName;
  final String lastName;
  final String email;
  @Default
  final int age = Integer.MIN_VALUE;
  @Default
  final char gender = 'N';
  @Default
  final Collection<String> hobbies = emptyList();
}
