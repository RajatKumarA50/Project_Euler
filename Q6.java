
public class Q6 
{

	public static void main(String[] args)
    {
        int sum1=0,sum2=0,diff=0;
        for(int i=1;i<=100;i++)
        {
        	sum2=sum2+i;
        	sum1=sum1+(i*i);
        }
        sum2=sum2*sum2;
        diff=sum2-sum1;
        System.out.println(diff);
        
    }
}