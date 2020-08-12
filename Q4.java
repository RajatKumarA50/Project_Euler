
// Q4  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Q4 {
	
	
	    public static void main(String[] args)
	    {
	        int r,q=0,s=0,temp=0,large=0;
	        for(int i=100;i<1000;i++)
	        {
	            
	            for(int j=100;j<1000;j++)
	            {
	             temp=i*j;
	             q=temp;
	             s=0;
	             while(temp>0)
	             {
	              r=temp%10;
	              s=(s*10)+r;     
	              temp=temp/10;
	             }
	             if(q==s&&q>=large)
	             {
	                 large=q;
	                 
	                }
	            }
	        }
	                System.out.println(large);
	                
	    }
	}
	            


