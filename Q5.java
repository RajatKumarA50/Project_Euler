// Q5  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Q5 
{

	public static void main(String[] args)
    {
		long maxNumber = Long.MAX_VALUE;
        for (long n = 21; n < maxNumber; n++) 
        {
            if (n % 20 == 0 && n % 19 == 0 && n % 17 == 0 && n % 16 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0
                    && n % 9 == 0 && n % 7 == 0 && n % 5 == 0 && n % 3 == 0 && n % 2 == 0) {
                System.out.println(n);
                break;
            }
        }
    
    }
}
