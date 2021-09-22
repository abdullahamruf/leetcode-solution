import java.util.Arrays;
import java.util.Scanner;

public class arraysquaresorting {
	 public int[] sortedSquares(int[] nums) {
		
		 for(int i=0;i<nums.length;i++) {
			 nums[i]=nums[i]*nums[i];
			
			 System.out.println(nums[i]);
		 }
		 Arrays.sort(nums);
		
		
	return nums;
	    }
	 public static void main(String args[]){  
			
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the size of the array that is to be created::");
		    int size = sc.nextInt();
		    int[] myArray = new int[size];
		    System.out.println("Enter the elements of the array ::");

		    for(int i=0; i<size; i++) {
		       myArray[i] = sc.nextInt();
		    }
		    arraysquaresorting  m = new arraysquaresorting();
		    m. sortedSquares(myArray);
				
				   
				}
}
