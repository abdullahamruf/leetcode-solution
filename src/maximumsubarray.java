import java.util.Scanner;

public class maximumsubarray {
	 public int maxSubArray(int[] nums) {
	        
	        int result = nums[0];
	        
	       for(int i = 1; i < nums.length ; i ++){
	            nums[i] = Math.max((nums[i] + nums[i-1]), nums[i]);
	          if(result < nums[i])
	                result = nums[i];
	        }
	        System.out.println(result);
	        return result;
	    }
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
	      maximumsubarray m = new  maximumsubarray();
	    m.maxSubArray(myArray);
	     // System.out.println()
	   }
}


