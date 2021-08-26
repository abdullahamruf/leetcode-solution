import java.util.Scanner;

public class ArraysToMethod {
	public int removeDuplicates(int[] nums) {
	    if (nums ==null ||  nums.length ==0) {
        	return 0;
        }
	       
	        int index =1;
	        for(int i=0;i<nums.length-1;i++) {
	        	if (nums[i]!=nums[i+1]) {
	        		nums[index++]=nums[i+1];
	        		
	        		
	        	}
	        	
	        }
	        return index;
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
	      ArraysToMethod m = new ArraysToMethod();
	      System.out.println("removing::"+m.removeDuplicates(myArray));
	     // System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
	}