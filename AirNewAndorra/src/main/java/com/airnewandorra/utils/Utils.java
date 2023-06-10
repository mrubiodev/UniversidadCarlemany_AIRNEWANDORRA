package com.airnewandorra.utils;

import java.util.Calendar;

public final class Utils {

  // comprobamos si el string es un número
  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    try {
      double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  // comprobamos si el string es un email
  public static boolean isEmail(String email) {
    if (email == null) {
      return false;
    }
    try {
      String[] emailParts = email.split("@");
      if (emailParts.length != 2) {
        return false;
      }
      String[] domainParts = emailParts[1].split("\\.");
      if (domainParts.length != 2) {
        return false;
      }
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  // comprobamos si el string es una fecha en formato dd/MM/yyyy
  public static boolean isDate(String date) {
    if (date == null) {
      return false;
    }
    try {
      String[] dateParts = date.split("/");
      if (dateParts.length != 3) {
        return false;
      }
      int day = Integer.parseInt(dateParts[0]);
      int month = Integer.parseInt(dateParts[1]);
      int year = Integer.parseInt(dateParts[2]);
      if (day < 1 || day > 31) {
        return false;
      }
      if (month < 1 || month > 12) {
        return false;
      }
      
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  // comprobamos que el string "dni" es un DNI válido (8 números y 1 letra)
  public static boolean isValidDNI(String dni) {
    if (dni == null) {
      return false;
    }
    try {
      String[] dniParts = dni.split("-");
      if (dniParts.length != 2) {
        return false;
      }
      String dniNumbers = dniParts[0];
      String dniLetter = dniParts[1];
      if (dniNumbers.length() != 8) {
        return false;
      }
      if (!isNumeric(dniNumbers)) {
        return false;
      }
      if (dniLetter.length() != 1) {
        return false;
      }
      if (!dniLetter.matches("[a-zA-Z]")) {
        return false;
      }
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}
