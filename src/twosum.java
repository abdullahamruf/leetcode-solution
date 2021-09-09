import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
    	HashMap <Integer,Integer> maruf = new HashMap <>(); 
    	for(int i=0;i<nums.length;i++) {
    		maruf.put(nums[i],i);
    	}
    	for(int j=0;j<nums.length;j++) {
    		
    	int b=	target-nums[j];
    	System.out.println(b);
    	if(maruf.containsKey(b) && maruf.get(b) != j) {
    		return new int [] {maruf.get(b),j};
    		
    		
    		
    	}
    
    }
    	return nums;
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
	      twosum m = new  twosum();
	      m.twoSum(myArray,10);
	     // System.out.println()
	   }
}
