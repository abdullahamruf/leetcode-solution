import java.util.Scanner;

public class removeelement {
	public int removeElement(int[] nums, int val) {
		
		if(nums==null || nums.length==0) {
			return 0;
		}
		int a=0;
		for(int i=0;i<nums.length;i++) {
			
			if (nums[i]!=val) {
			  nums [a]=nums[i];	
			  a++;
				
			}
		}
		System.out.println(a);
 return a;
 
	}
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int siz = sc.nextInt();
	      int[] myArray = new int[siz];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<siz; i++) {
	         myArray[i] = sc.nextInt();
	      }
	      System.out.println("Enter which value you want to remove ::");

	      removeelement m = new removeelement();
	      int val = sc.nextInt();
	     m.removeElement(myArray,val);
	   
	   }
}
