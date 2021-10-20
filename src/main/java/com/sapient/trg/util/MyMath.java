package com.sapient.trg.util;

public class MyMath {
	public static boolean isPerfectnumber(int n) {
        // 1 is not a perfect number
        if (n == 1)
            return false;
  
        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;
  
        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {
            
            if (n % i == 0) {
                sum += i;
            }
            
        }
  
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;
  
        return false;
}

public static long factorial(int n) {
	if (n == 0)
        return 1;

    return n * factorial(n - 1);
}

public static boolean isPrime(int n) {
	
    if (n <= 1)
        return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
	
}
public static long sumOfPrimes(int n) {
	
	/*
	 * returns sum of primes numbers between 1 to n.
	 * Invoke isPrime() within this method
	 */
	int sum=0,i;
	for( i=1; i<=n; i++)
	{
		if(isPrime(i))
		{
			sum=sum+i;
		}
		
	}
	return sum;
}
public static boolean isArmstrongNumber(int n)
{
	int no_of_digits = String.valueOf(n).length();
    int sum = 0;
    int value = n;
    for(int i=1;i<=no_of_digits;i++) {
        int digit = value%10;
        value = value/10;
        sum = sum + (int)Math.pow(digit, no_of_digits);
    }
    if(sum == n) {
        return true;
    }else {
        return false;
    }
}

public static int reverseNumber(int n) {
	int rev_num = 0;
    while (n > 0) {
        rev_num = rev_num * 10 + n % 10;
        n = n / 10;
    }
    return rev_num;
}
public static int decimalToBinary(int n) {
	 // To store the binary number
    int B_Number = 0;
    int cnt = 0;
    while (n != 0) {
        int rem = n % 2;
        double c = Math.pow(10, cnt);
        B_Number += rem * c;
        n /= 2;

        // Count used to store exponent value
        cnt++;
    }

    return B_Number;
}
public static int binaryToDecimal(int n) {
	int num = n;
    int dec_value = 0;

    // Initializing base
    // value to 1, i.e 2^0
    int base = 1;

    int temp = num;
    while (temp > 0) {
        int last_digit = temp % 10;
        temp = temp / 10;

        dec_value += last_digit * base;

        base = base * 2;
    }

    return dec_value;
}
public static int getSumOfNfibos(int n) {
	if (n <= 0)
           return 0;
      
        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
      
        // Initialize result
        int sum = fibo[0] + fibo[1];
      
        // Add remaining terms
        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }
      
        return sum;
}
public static boolean isPalindromeNumber(int n) {
	int palindrome = n; // copied number into variable
    int reverse = 0;

    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    // if original and the reverse of number is equal means
    // number is palindrome in Java
    if (n == reverse) {
        return true;
    }
    return false;
}

}
