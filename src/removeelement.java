import java.util.Scanner;

public class removeelement {
	public int removeElement(int[] nums, int val) {
        int len= nums.length;
        if(nums == null ||  len==0){
            return 0;
            
        }
         int size=0;
        for(int i =0;i<len;i++){
            if(nums[i] != val){
                nums[size]=nums[i];
                size++;
            }
             
        }
        System.out.println("after removing the value size is"+size);
        return size;
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
	   //  System.out.println("size is"+size);
	     // System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
}
