import java.util.Scanner;

public class SearchInsertPosition {
   public int searchInsert(int[] nums, int target) {
	  for(int i=0;i<nums.length;i++) {
		  if (nums[i]==target) {
			  System.out.println(i);  
		  }
		  else if(nums[i]!=target) {
			  int j=nums.length-1;
			  
		  }
		  
	  }
	  return 0;
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
	      SearchInsertPosition m = new SearchInsertPosition();
	      m.searchInsert(myArray,7);
	     // System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
}
