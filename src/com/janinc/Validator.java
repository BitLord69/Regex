package com.janinc;

/*
Programmerat av Jan-Erik "Janis" Karlsson 2020-02-12
Programmering i Java EMMJUH19, EC-Utbildning
CopyLeft 2020 - JanInc
*/

import java.util.regex.Pattern;

public class Validator {
    public static boolean validatePhoneNumber(String phoneNumber) {
        String regEx = "^0[0-9 -]{8,15}";
        return Pattern.matches(regEx, phoneNumber);
    } // validatePhoneNumber

    public static boolean validateEmailAddress(String address) {
        String regEx = "^[a-zA-Z]+\\w*@[a-zA-Z]?[a-zA-Z.0-9]{2,}\\.[a-zA-z]{2,}$";
        return Pattern.matches(regEx, address);
    } // validateEmailAddress

    public static boolean validatePnr(String pnr) {
        String regEx = "^[0-9]{2}[0-9- ]{2,8}([0-9 -+]{1}[0-9]{1,4})$";
        return Pattern.matches(regEx, pnr);
    } // validatePnr

    public static boolean validatePassword(String pwd) {
        String regEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#¤$%^&*\"'])(?!.*\\s).{8,}$";
        return Pattern.matches(regEx, pwd);
    } // validatePassword
} // class Validator
