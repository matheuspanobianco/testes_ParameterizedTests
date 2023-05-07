package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanVoteTest {

    @ParameterizedTest
    @CsvSource({
            "0, Sem direito a votar",
            "7, Sem direito a votar",
            "15, Sem direito a votar",
    })
    void verifyCantVote(int age, String textExpected) {

        assertEquals(textExpected, CanVote.examineAge(age));
    }

    @ParameterizedTest
    @CsvSource({
            "16, Voto facultativo",
            "17, Voto facultativo",
            "71, Voto facultativo",
            "89, Voto facultativo",
    })
    void verifyOptionalVote(int age, String textExpected) {

        assertEquals(textExpected, CanVote.examineAge(age));
    }

    @ParameterizedTest
    @CsvSource({
            "18, Voto obrigatório",
            "40, Voto obrigatório",
            "70, Voto obrigatório"
    })
    void verifyMandatoryVote(int age, String textExpected) {

        assertEquals(textExpected, CanVote.examineAge(age));
    }

}