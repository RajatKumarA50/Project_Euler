
public class Q9 {

	public static void main(String[] args) {
	    int a,b,c;
	    int ans=0;
	    for(a=1;a<1000;a++)
	    {
	       for(b=a+1;b<1000;b++)
	       {
	          c=1000-a-b;
	          
	        if((a*a)+(b*b)==(c*c))
	        {
	          ans=a*b*c;
	          break;
	                                
	                  }
	          }
	  }
	     
	    System.out.println(ans);
	}

}