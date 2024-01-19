package util;

public class Counter {

    public int _ctr;

    public Counter() {
        this._ctr = 0;
    }

    public void incrementToPrime() {
        _ctr = getNextPrime(_ctr + 1);
    }

    public void decrementToPrime() {
        _ctr = getPreviousPrime(_ctr - 1);
    }

    // Utility methods to find the next and previous primes
    private int getNextPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    private int getPreviousPrime(int num) {
        while (!isPrime(num)) {
            num--;
        }
        return num;
    }

    // Check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}