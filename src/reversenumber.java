
public class reversenumber {
	
	
	         

		    public int reverse(int x) {
		    	  boolean negativenumber = false;
			        if (x < 0) {
			            negativenumber = true;
			            x = -x;
			        }
			        long reverse = 0;
			        while (x > 0) {
			            reverse = reverse * 10 + x % 10;
			            x /= 10;
			        }
			        if (reverse > Integer.MAX_VALUE) {
			            return 0;
			        }
			        return (int) (negativenumber ? -reverse :reverse);
		    
		 
	    }
	
	public static void main(String args[]){  
		
		reversenumber obj=new reversenumber();
		System.out.print(obj.reverse(-2147483648));
		
		   
		} 
		 
}

	



