
public class Q1 {

	public static void main(String[] args) 
	{
	
		int i,sum=0,sum1=0;
		for(i=1;i<1000;i++)
		{
			if(i%3==0 ||i%5==0)
				sum=sum+i;
			
		}
		 
			System.out.println("Sum of multiples of 3 and 5 below 1000 is: "+sum);
		

	}

}