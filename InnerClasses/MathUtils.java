package com.training.InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    static class Factorial {
        public static long compute(int n) {
            long result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        }
    }

    public List<Integer> computePrimes(int n) {

        List<Integer> primes = new ArrayList<>();

        class PrimeChecker {

            public boolean isPrime(int num) {
                if (num <= 1) return false;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return false;
                }

                return true;
            }
        }

        PrimeChecker checker = new PrimeChecker();
        for (int i = 2; i <= n; i++) {
            if (checker.isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        long fact = MathUtils.Factorial.compute(5);
        System.out.println("Factorial of 5 = " + fact);

        MathUtils mu = new MathUtils();
        List<Integer> primes = mu.computePrimes(20);

        System.out.println("Primes up to 20: " + primes);
    }
}