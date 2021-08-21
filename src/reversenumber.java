
public class reversenumber {
	
	
	         

		    public int reverse(int x) {
		      long rev=0;
		        int number =x;
		        while(number!=0) {
		        	int rem=number%10;
		        	rev=rev*10+rem;
		        	number=number/10;
		        }
		        	if (rev > Integer.MAX_VALUE) {
			            return 0;
			        }
		        	
		        	
		        
		        return (int) (rev);
		    
		 
	    }
	
	public static void main(String args[]){  
		
		reversenumber obj=new reversenumber();
		System.out.print(obj.reverse(-2147483648));
		
		   
		} 
		 
}

	



