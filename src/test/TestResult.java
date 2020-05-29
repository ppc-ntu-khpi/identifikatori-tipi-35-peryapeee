package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        /**
         * Encrypting of english words
         */
        Exercise ex = new Exercise(97,26);
        String enc = ex.encrypt("poltava","ppc");
        System.out.println("English text - " + enc);
        String dec = ex.decrypt(enc,"ppc");
        System.out.println("Decrypted text - " + dec);
        /**
         * Encrypting of russian words
         */
        Exercise exercise = new Exercise(1072, 33);
        enc = exercise.encrypt("полтава", "ппк");
        System.out.println("Russian text - " + enc);
        dec = exercise.decrypt(enc, "ппк");
        System.out.println("Decrypted text - " + dec);
    }
}
