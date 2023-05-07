package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanVoteTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/cant-vote-test.csv")
    void verifyCantVote(int age, String text) {
        assertEquals(text, CanVote.examineAge(age));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/mandatory-vote-test.csv")
    void verifyMandatoryVote(int age, String text) {
        assertEquals(text, CanVote.examineAge(age));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/optional-vote-test.csv")
    void verifyOptionalVote(int age, String text) {
        assertEquals(text, CanVote.examineAge(age));
    }

}