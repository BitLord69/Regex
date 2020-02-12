package com.janinc;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] phoneNumbers = {"08-12 34 56", "040-123 45", "0704-12 34 56", "0707321654", "0707 555 666", "704223124", "042154", "Hej!"};
        String[] emailAddies = {"janis_k@hotmail.com", "_janis_k@hotmail.com", "hejhopp@snurrespratt.se", "a@a.com", "ingendoman@hej", "qi@bbc.co.uk"};
        String[] pnrs = {"1990-08-21 1234", "9008211234", "900821-1234", "1918-09-22 2345", "180922+2345", "111113456-789452"};
        String[] pwds = {"Hejsan!", "hejSan12!", "ttjosansadfrgdrgerlwg", "%##@3\t#¤\"!#dfAS"};

        String rep1 = "hej\n" + "hejsan1\n" + "\n" + "hall100å\n" + "what's up";
        String rep2 = "hej      på  dig\n" + "   hejsan\n" + " hej      \n" + "     hej    hej";

        validate(phoneNumbers, Validator::validatePhoneNumber);
        validate(emailAddies, Validator::validateEmailAddress);
        validate(pnrs, Validator::validatePnr);
        validate(pwds, Validator::validatePassword);

        String s1 = rep1.replaceAll("[0-9]", "");
//        System.out.println(rep1.replaceAll("[0-9]", "").replaceAll("^\n", ""));
//        System.out.println(s2.replaceAll("^\n", ""));
         Stream.of(s1.split("\n")).filter(s -> !s.isBlank()).forEach(System.out::println);

        System.out.println("-".repeat(30));

        Stream.of(rep2.
                replaceAll(" {2,}", " ").
                split("\n")).
                map(String::trim).
                forEach(System.out::println);
    } // main

    public static void validate(String[] list, Predicate<String> validator) {
        for (String l: list) {
            System.out.println(l + " är" + (validator.test(l) ? " " : " inte ") + "korrekt.");
        } // for String...

        System.out.println("-".repeat(30));
    } // validate
} // class Main