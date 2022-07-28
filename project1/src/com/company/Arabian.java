package com.company;

public class Arabian {
    public static String checkArabian(String ex) {
        if (ex.length() > 6) throw new RuntimeException("Неверный ввод");//убираем возможность внесения трех чисел и дробных чисел
        String[] exArray = ex.split(" ");
        return String.valueOf(checkSign(exArray));
    }

    public static int checkSign(String[] exArray) {
        int result = 0;//переменная для результата
        int num1 = Integer.parseInt(exArray[0]);
        int num2 = Integer.parseInt(exArray[2]);
        if (num1 < 1 || num1 > 10 || num2 > 10 || num2 < 1)
            throw new RuntimeException("Неверный ввод");//убираем возможность внесения чисел меньше 1 и больше 10

        switch (exArray[1]) { // проверяем знак в примере
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            default:
                throw new RuntimeException("Неверный ввод");
        }
        return result;
    }
}