//package TestSource;
//
//import static org.assertj.core.api.Assertions.*;
//
//public class AssertJ {
//
//    // entry point for all assertThat methods and utility methods (e.g. entry)
//
//    // basic assertions
//    assertThat(frodo.getName()).isEqualTo("Frodo");    //비교...
//    assertThat(frodo).isNotEqualTo(sauron);            //다르냐~
//
//    // chaining string specific assertions
//    assertThat(frodo.getName()).startsWith("Fro")    시작  끝 ....소문자....
//                           .endsWith("do")
//                           .isEqualToIgnoringCase("frodo");
//
//    // collection specific assertions (there are plenty more)
//// in the examples below fellowshipOfTheRing is a List<TolkienCharacter>
//    assertThat(fellowshipOfTheRing).hasSize(9)     LIST 의 사이즈  안에 포함여부....사로몬이 없는지...
//                               .contains(frodo, sam)
//                               .doesNotContain(sauron);
//
//    // as() is used to describe the test and will be shown before the error message
//    assertThat(frodo.getAge()).as("check %s's age", frodo.getName()).isEqualTo(33);     as 간단한 설명 as....숫자 비교..
//
//    // exception assertion, standard style ...
//    assertThatThrownBy(() -> { throw new Exception("boom!"); }).hasMessage("boom!");      에러 감지해서 boom 포함여부 확인. .
//    // ... or BDD style
//    Throwable thrown = catchThrowable(() -> { throw new Exception("boom!"); });
//    assertThat(thrown).hasMessageContaining("boom");                              assertThatThrownBy --> assertThat...으로도 표현??
//
//    // using the 'extracting' feature to check fellowshipOfTheRing character's names
//    assertThat(fellowshipOfTheRing).extracting(TolkienCharacter::getName)
//                               .doesNotContain("Sauron", "Elrond");
//
//    // extracting multiple values at once grouped in tuples
//    assertThat(fellowshipOfTheRing).extracting("name", "age", "race.name")
//                               .contains(tuple("Boromir", 37, "Man"),
//    tuple("Sam", 38, "Hobbit"),
//    tuple("Legolas", 1000, "Elf"));
//
//    // filtering a collection before asserting
//    assertThat(fellowshipOfTheRing).filteredOn(character -> character.getName().contains("o"))
//            .containsOnly(aragorn, frodo, legolas, boromir);
//
//    // combining filtering and extraction (yes we can)
//    assertThat(fellowshipOfTheRing).filteredOn(character -> character.getName().contains("o"))
//            .containsOnly(aragorn, frodo, legolas, boromir)
//                               .extracting(character -> character.getRace().getName())
//            .contains("Hobbit", "Elf", "Man");
//
//// and many more assertions: iterable, stream, array, map, dates, path, file, numbers, predicate, optional ...
//}
