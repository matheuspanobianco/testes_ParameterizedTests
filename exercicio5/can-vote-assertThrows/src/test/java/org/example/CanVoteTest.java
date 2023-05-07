package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CanVoteTest {
    @ParameterizedTest
    @ValueSource(ints = {-2, 150})
    void verifyExamineAgeThrowsException(int age) {
        assertThrows(IllegalArgumentException.class, () -> CanVote.examineAge(age));
    }
}