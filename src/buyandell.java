import java.util.Scanner;

public class buyandell {
	 public int maxProfit(int[] prices) {
		 int mim=Integer.MAX_VALUE;
		 for(int i=0;i<prices.length;i++) {
			 
		
		 }
		 System.out.println(mim);

		 return mim;
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
	      buyandell m = new  buyandell();
	    m.maxProfit(myArray);
	     // System.out.println()
	   }
}
