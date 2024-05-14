package org.example.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PracticeJavaLocale {

    public static void main(String[] args) {

        //find age
        LocalDate birthDay = LocalDate.of(1993, 07, 06);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));

    }
}
