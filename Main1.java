// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n) n! (произведение чисел от 1 до n)

package Sem_Java_Test.Sem1_HW;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Вычисление суммы чисел 1 до n, факториала n!  Введите n(>0): ");
        int n = iScanner.nextInt();
        iScanner.close();
        int summ = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            summ += i;
            fact *= i;
        }
        System.out.printf("Cумма чисел 1 до %d = %d\n", n, summ);
        System.out.printf("Факториал %d! = %d", n, fact);
    }
}
