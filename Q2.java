
public class Q2 {

	public static void main(String[] args) 
	{
	    int x=1,y=2,sum=0;
		while(x<=4000000)
		{
			if(x%2==0)
			{
				sum=sum+x;
			}
			int z=x+y;
			x=y;
			y=z;
		}
        System.out.println("numbers are: "+sum);
	}

}
