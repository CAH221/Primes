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
public class PrimeTest {

    public static void main(String[] args) {
        // Test the isPrime method with a large number
        int number = 10000019;
        // Check if 'number' is prime and print the result
        if (Primes.isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }

        // Test the primeList method to list all primes less than 50
        System.out.println("Prime numbers less than 50:");
        Primes.primeList(50);

        // Test the greaterPrime method to find the next prime greater than a given number
        int baseNumber = 50;
        int greaterPrime = Primes.greaterPrime(baseNumber);
        // Print the first prime number greater than 'baseNumber'
        System.out.println("The first prime number greater than " + baseNumber + " is: " + greaterPrime);

        // Additional testing strategy: Testing edge cases and performance for larger inputs
        System.out.println("Prime numbers less than 1000:");
        Primes.primeList(1000);
    }
}