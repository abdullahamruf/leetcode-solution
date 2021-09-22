import java.util.Scanner;

public class findevennumberofdigits {
	 public int findNumbers(int[] nums) {
	       int ans=0;     
	       
			 for (int i=0;i<nums.length;i++) {
				 int count=0;
				 while(nums[i] !=0) {
					 
					 nums[i]=nums[i]/10;
					 count++;
					 
					
				 }
				 if (count%2==0) {
					 ans++;
				 }
			 }
			System.out.println(ans);
			 return ans;
		 
		 
		 
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
		    findevennumberofdigits  m = new findevennumberofdigits ();
		    m.  findNumbers(myArray);
				
				   
				}


}
