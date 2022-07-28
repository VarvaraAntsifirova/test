package com.company;

import java.util.Scanner;

public class Begin {
    public static void main(String[] args) {
        System.out.println("Введите выражение для вычисления: ");
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String[] exArray = ex.split(" ");
        if (isNumeric(exArray)) {
            System.out.println(Arabian.checkArabian(ex));
        } else {
            System.out.println(Rom.checkRom(ex));
        }
    }

    public static boolean isNumeric(String[] exArray) {
        try {
            Integer.parseInt(exArray[0]);
            Integer.parseInt(exArray[2]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
