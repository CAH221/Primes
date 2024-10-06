//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                            *//
//*                                                   *//
//* Description: Main class to test the Primes class, *//
//*              which includes testing prime number  *//
//*              identification, listing primes, and  *//
//*              finding the next prime.              *//
//*                                                   *//
//* Date: 06/10/2024                                  *//
//****************************************************//
import java.lang.Math;

public class Primes {

    // Static method to check if a number is prime
    public static boolean isPrime(int x) {
        // If x is less than or equal to 1, it is not a prime number
        if (x <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (x == 2) {
            return true;
        }
        // If x is even and greater than 2, it is not a prime number
        if (x % 2 == 0) {
            return false;
        }
        // Calculate the limit for the loop, which is the square root of x rounded up
        int limit = (int) Math.sqrt(x) + 1;
        // Loop from 3 to limit, incrementing by 2 each time (only check odd divisors)
        for (int i = 3; i < limit; i += 2) {
            // If x is divisible by i, it is not a prime number
            if (x % i == 0) {
                return false;
            }
        }
        // If no divisors were found, x is a prime number
        return true;
    }

    // Static method to print all prime numbers less than the given parameter "max"
    public static void primeList(int max) {
        // Loop from 2 to max, as prime numbers are greater than or equal to 2
        for (int i = 2; i < max; i++) {
            // If i is prime, print it
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        // Move to the next line after printing all primes
        System.out.println();
    }

    // Static method to find the first prime number greater than the given parameter "n"
    public static int greaterPrime(int n) {
        // Start with the candidate number being one greater than n
        int candidate = n + 1;
        // Increment the candidate until a prime number is found
        while (!isPrime(candidate)) {
            candidate++;
        }
        // Return the first prime number greater than n
        return candidate;
    }
}