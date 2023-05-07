package org.example;

public class CanVote {
    public static String examineAge(int age) {
        System.out.printf("Teste executado: %s ", age);
        return age >= 16 ?
                (age >= 18 && age <= 70 ?
                        "Voto obrigatório" :
                        "Voto facultativo") :
                "Sem direito a votar";
    }
}
