package com.company;

import java.util.*;

public class Fortune {
    static String userFname;
    static String userLname;
    static int userAge;
    static int userMonth;
    static String userColor;
    static int userNumSiblings;

    static int retYears;
    static String vacHome;
    static String transport;
    static String balance;



    public static void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        userFname = scanner.nextLine();

        System.out.println("Please enter your last name.");
        userLname = scanner.nextLine();

        System.out.println("Please enter your age.");
        userAge = scanner.nextInt();

        System.out.println("Please enter your birth month as a number.");
        userMonth = scanner.nextInt();

        System.out.println("Please enter your favorite ROYGBIV color. Type \"Help\" to get a list of ROYGBIV Colors.");
        userColor = scanner.next().toLowerCase();

        HashMap<String, String> colors = new HashMap<>();
        colors.put("red", "Maserati");
        colors.put("orange", "stallion");
        colors.put("yellow", "chariot");
        colors.put("green", "taxi");
        colors.put("blue", "rickshaw");
        colors.put("indigo", "motor scooter");
        colors.put("violet", "flying saucer");

        do {
            if (userColor.equals("Help")) {
                System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
            } else {
                System.out.println("This is not a valid color. Please try again.");
            }
            userColor = scanner.next().toLowerCase();
        } while (!colors.containsKey(userColor));

        System.out.println("Please enter the number of siblings you have.");
        userNumSiblings = scanner.nextInt();

        if (userAge%2==0) {
            retYears = 12;
        } else {
            retYears = 14;
        }

        if (userNumSiblings==0) {
            vacHome = "Boca Raton, FL";
        } else if (userNumSiblings==1) {
            vacHome = "Nassau, Bahamas";
        } else if (userNumSiblings==2) {
            vacHome = "Ponta Negra, Brazil";
        } else if (userNumSiblings==3) {
            vacHome = "Portland, Oregon";
        }else if (userNumSiblings>3) {
            vacHome = "Baton Rouge, LA";
        } else {
            vacHome = "Chernobyl, Ukraine";
        }

        transport = colors.get(userColor);

        if (userMonth >=1 || userMonth <= 4) {
            balance = "$256,000.76";
        } else if (userMonth >=5 || userMonth <= 8) {
            balance = "3,687,105.42";
        } else if (userMonth >=9 || userMonth <= 12) {
            balance = "$86.23";
        } else {
            balance = "$0.00";
        }

        System.out.println(userFname + " " +
                userLname + " will retire in " +
                retYears + " years with " +
                balance + " in the bank,\n" + "a vacation home in " +
                vacHome + ", and travel by " +
                transport+".");

        scanner.close();


    }
}
