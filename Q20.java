import java.math.BigInteger;
public class Q20 {

	public static void main(String[] args) 
	{
		
BigInteger fact = BigInteger.valueOf(1);
		
		for (int i = 1; i <= 100; i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		String s=fact.toString();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			int j = Integer.parseInt(s.substring(i,i+1));
			sum += j;
	}
       System.out.println(sum);
}
}