import java.util.Scanner;

public class plus1 {
public int[] plusOne(int[] digits) {
	int len = digits.length;
	
      for (int i =len-1;i>=0;i--) {
    	  if (digits[i]!=9) {
    		  digits[i]++;
    		  return digits;
    		  
    	  }
    	  
    	  
      }
       return digits;
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
    plus1 m = new  plus1();
     m. plusOne(myArray);
   // System.out.println()
  
 }
}
