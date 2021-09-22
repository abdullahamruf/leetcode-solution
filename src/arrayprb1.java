import java.util.Scanner;

public class arrayprb1 {
	public int findMaxConsecutiveOnes(int[] nums) {
	    int count=0;
	        int ans=0;
	        for(int i=0;i<nums.length;i++){
	            
	            if(nums[i]==1){
	                count++;
	            }else {
	           ans=Math.max(count, ans);
	           count=0;
	            }
	        }
	        //System.out.println(Math.max(count,ans));
	        return Math.max(count, ans);
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
    arrayprb1 m = new arrayprb1();
    m. findMaxConsecutiveOnes(myArray);
		
		   
		}

}