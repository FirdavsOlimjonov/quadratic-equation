package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = (b * b - 4 * a * c);
        if (D < 0) {
            System.out.println("no roots");
            return;
        }

        double x1 = (-b - Math.sqrt(D))/(2*a);
        double x2 = (-b + Math.sqrt(D))/(2*a);

        if (x1 == x2) System.out.println(x1);
        else System.out.println(x1+" "+ x2);
    }

}