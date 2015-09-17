// Sehar Khan
// CISC 181- Professor Gibbons
// PS2- 9/15/15

public class MyInteger {
	
	private int value; 
	
	// Constructor 
	public MyInteger (int value) {
		this.value = value;
	}
	
	// Getter
	public int getValue () {
		return value;
	}
	
	// Methods no args
	public boolean isEven () {
		if (this.value%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd () {
		if (this.value%2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isPrime () {
		if (this.value < 2) {
			return false;
		}
		for (int i = 2; i < value; i++){
			if (value%i == 0) {
				return false; 
			}
		}
			return true;
	}
	
	// Static methods with int args 
	public static boolean isEven (int j) {
		if (j%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd (int k) {
		if (k%2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isPrime (int l) {
		if (l < 2) {
			return false;
		}
		for (int i = 2; i < l; i++){
			if (l%i == 0) {
				return false; 
			}
		}
			return true; 
	}
	
		
	// Static methods with new objects
	public static boolean isEven (MyInteger even) {
		if (even.getValue()%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd (MyInteger odd) {
		if (odd.getValue()%2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isPrime(MyInteger prime) {
		if (prime.getValue() < 2) {
			return false;
		}
		for (int i = 2; i < prime.getValue(); i++){
			if (prime.getValue()%i == 0) {
				return false; 
			}
		}
			return true; 
	}
	
	// Checking if two values are equal
	public boolean equals(int s) {
		if (s == this.value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger sehar) {
		if (sehar.getValue() == this.value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Static method parseInt; converting a string or array to an integer
	public static int parseInt(char [] sumInt) {
		return parseInt(sumInt);	
	}
	
	public static int parseInt(String sumInt2) {
		return Integer.parseInt(sumInt2);
	}
		
}
