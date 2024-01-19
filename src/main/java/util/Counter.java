package util;

import java.util.StringTokenizer;

public class Counter {

	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}
	

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		increment();
		// Check if the current value of _ctr is even
		if (_ctr % 2 == 0) {
			// Already even, no need to increment
			System.out.println("Counter is already even.");
		} else {
			// Increment to the closest even number
			_ctr = (_ctr % 2 == 0) ? _ctr : _ctr + 1;
			System.out.println("Incremented to the closest even number.");
		}
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		decrement();
		// Check if the current value of _ctr is even
		if (_ctr % 2 == 0) {
			// Already even, no need to decrement
			System.out.println("Counter is already even.");
		} else {
			// Decrement to the closest even number
			_ctr = (_ctr % 2 == 0) ? _ctr : _ctr - 1;
			System.out.println("Decremented to the closest even number.");
		}
	}


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


	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		int count = 0;
	
		while (tokenizer.hasMoreTokens()) {
			if (tokenizer.nextToken().equalsIgnoreCase(word)) {
				count++;
			}
		}
	
		_ctr = count;
	}
}
