import java.util.Arrays;
import java.util.Scanner;

public class mergesortedarray {
	
	
	  public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int total = n + m;
			
	        for(int i = 0; i < n; i++) {
	            nums1[total-i-1] = nums2[i];
	        }
	        System.out.println(nums1);
	        Arrays.sort(nums1);
	    
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
	      int size1 = sc.nextInt();
	      int[] myArray1 = new int[size1];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size1; i++) {
	         myArray1[i] = sc.nextInt();
	      }
	      mergesortedarray m = new  mergesortedarray();
	    m.merge(myArray,size,myArray1,size1);
	     // System.out.println()
	   }

}
