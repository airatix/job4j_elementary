package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }

        int n = 2;
        while (n < number) {
            if (number % n == 0) {
                prime = false;
                break;
            }
            n++;
        }
        return prime;
    }
}
