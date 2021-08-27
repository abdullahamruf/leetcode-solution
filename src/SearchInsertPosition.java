import java.util.Scanner;

public class SearchInsertPosition {
   public int searchInsert(int[] nums, int target) {
	   int i=0; 
	    int j=nums.length-1;
	 
	    while(i<=j){
	        int mid = (i+j)/2;
	 
	        if(target > nums[mid]){
	            i=mid+1;
	        }else if(target < nums[mid]){
	            j=mid-1;
	        }else{
	            return mid;
	        }
	    }
	 
	    return i;
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
	      m.searchInsert(myArray,2);
	     // System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
}
