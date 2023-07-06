// 3) Реализовать простой калькулятор

package Sem_Java_Test.Sem1_HW;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation = ' ';
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первый аргумент (Enter): \n");
        num1 = iScanner.nextDouble();
        System.out.printf("Введите второй аргумент (Enter): \n");
        num2 = iScanner.nextDouble();

        System.out.printf("Введите операцию (+, -, *, /): ");
        operation = iScanner.next().charAt(0);
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введите корректную операцию");
                return;
        }

        System.out.printf("Результат вычисления:\n");
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
