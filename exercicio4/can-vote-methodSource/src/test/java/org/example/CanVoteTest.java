package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanVoteTest {
    private static Stream<Arguments> dataCantVoteProvider() {
        return Stream.of(
                Arguments.of(0, "Sem direito a votar"),
                Arguments.of(7, "Sem direito a votar"),
                Arguments.of(15, "Sem direito a votar")
        );
    }
    private static Stream<Arguments> dataOptionalVoteProvider() {
        return Stream.of(
                Arguments.of(16, "Voto facultativo"),
                Arguments.of(17, "Voto facultativo"),
                Arguments.of(71, "Voto facultativo"),
                Arguments.of(89, "Voto facultativo")
        );
    }
    private static Stream<Arguments> dataMandatoryVoteProvider() {
        return Stream.of(
                Arguments.of(18, "Voto obrigatório"),
                Arguments.of(40, "Voto obrigatório"),
                Arguments.of(70, "Voto obrigatório")
        );
    }
    @ParameterizedTest
    @MethodSource("dataCantVoteProvider")
    void verifyCantVote(int age, String textExpected) {
        assertEquals(textExpected, CanVote.examineAge(age));
    }
    @ParameterizedTest
    @MethodSource("dataOptionalVoteProvider")
    void verifyOptionalVote(int age, String textExpected) {
        assertEquals(textExpected, CanVote.examineAge(age));
    }
    @ParameterizedTest
    @MethodSource("dataMandatoryVoteProvider")
    void verifyMandatoryVote(int age, String textExpected) {
        assertEquals(textExpected, CanVote.examineAge(age));
    }

}