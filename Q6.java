// Q6  The sum of the squares of the first ten natural numbers is, 1^2+2^2+...10^2=385.
// The square of the sum of the first ten natural numbers is,   (1+2+..10)^2=3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025-385=2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Q6 
{

	static int Square_Diff(int n){ 
		  
		int l, k, m; 
		    // Sum of the squares of the 
		    // first n natural numbers is 
		    l = (n * (n + 1) * (2 * n + 1)) / 6; 
		      
		    // Sum of n naturals numbers 
		    k = (n * (n + 1)) / 2; 
		  
		    // Square of k 
		    k = k * k; 
		      
		    // Differences between l and k 
		    m = Math.abs(l - k); 
		      
		    return m; 
		  
		} 
		  
		
		public static void main(String s[]) 
		{ 
		    int n = 100; 
		    System.out.println(Square_Diff(n));      
		      
		} 

}
