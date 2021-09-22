import java.util.Scanner;

public class maximumsubarray {
	 public int maxSubArray(int[] nums) {
		 int maxSum = nums[0];
	        int sum = 0;
	        
	        for(int i=0;i<nums.length;i++) {
	            sum = Math.max(sum+nums[i], nums[i]);
	            maxSum = Math.max(sum, maxSum);
	        }
	        return maxSum;
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


