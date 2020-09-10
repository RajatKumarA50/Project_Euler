// Q7  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class Q7 {

	static int N = 10001;

    private static boolean isOddPrime(long x) {

        for ( int i = 3 ; i*i <= x ; i+=2 ) {
            if ( x % i == 0 ) {
                return false;
            }               
        }
        return true;
    }

    public static void main(String[] args)  {
        
        int x;
        int i = 2;      // 3 is the 2nd prime number
        for ( x = 3 ; ; x+=2 ) {
            if ( isOddPrime(x) ) {              
                if ( i == N )
                    break;
                i++;
            }
        }
        System.out.println(x);

            }

}
