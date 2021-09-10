import java.util.Scanner;

public class removeduplicatearray {
	
    public int removeDuplicates(int[] nums) {
    	int size=1;
        for(int i =0;i<nums.length-1;i++) {
        	if(nums[i]!=nums[i+1]) {
        		nums[size]=nums[i+1];
        		size++;
        		
        	}
        }
        System.out.println(size);
        return size;
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
	   removeduplicatearray m = new  removeduplicatearray();
	    m. removeDuplicates(myArray);
	     // System.out.println()
	   }
}


