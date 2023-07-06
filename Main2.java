// 2) Вывести все простые числа от 1 до 1000

package Sem_Java_Test.Sem1_HW;

public class Main2 {

    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n; i++) {
            if (checkSimple(i))
                System.out.println(i);
        }
    }

    public static boolean checkSimple(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
