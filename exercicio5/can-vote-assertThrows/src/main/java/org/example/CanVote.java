package org.example;

public class CanVote {
    public static String examineAge(int age) {
        System.out.printf("Teste executado: %s \n", age);
        unrealAge(age);
        return age >= 16 ?
                (age >= 18 && age <= 70 ?
                        "Voto obrigatório" :
                        "Voto facultativo") :
                "Sem direito a votar";
    }

    private static void unrealAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 125) {
            throw new IllegalArgumentException();
        }
    }
}
