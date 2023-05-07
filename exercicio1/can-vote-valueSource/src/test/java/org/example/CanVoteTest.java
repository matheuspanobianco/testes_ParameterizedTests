package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanVoteTest {

    @ParameterizedTest
    @ValueSource(ints = {0,7,15})
    void verifyCantVote(int age){
        assertEquals("Sem direito a votar",CanVote.examineAge(age), "Com "+age+" anos é permitido votar");
    }
    @ParameterizedTest
    @ValueSource(ints = {16,17,71,89})
    void verifyOptionalVote(int age) {
        assertEquals("Voto facultativo",CanVote.examineAge(age), "Com "+age+" anos o voto não é facultativo");
    }
    @ParameterizedTest
    @ValueSource(ints = {18,50,70})
    void verifyMandatoryVote(int age) {
        assertEquals("Voto obrigatório",CanVote.examineAge(age), "Com "+age+" anos o voto não é obrigatório");
    }

//    @Test
//    void verifyMandatoryVoteUsingAssertAll() {
//        String mandatoryVote = "Voto obrigatório";
//        assertAll(
//                () -> assertEquals(CanVote.examineAge(18), mandatoryVote),
//                () -> assertEquals(CanVote.examineAge(35), mandatoryVote),
//                () -> assertEquals(CanVote.examineAge(70), mandatoryVote));
//    }

}