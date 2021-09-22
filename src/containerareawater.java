import java.util.Scanner;

public class containerareawater {
	 public int maxArea(int[] height) {
	
		 
		int len=height.length-1;
		int smallestheight=0;
		int maxarea=0;
	  int i=0;
	  
		while(i<len) {
			int diff=len-i;
			int fl=height[i];
			int ll=height[len];
			int min=Math.min(fl, ll);
		  maxarea=Math.max(maxarea,diff*min);
		  if (fl<ll) {
			  i++;
			 
		  }
		  else
			  len--;
				
		System.out.println(maxarea);
		}
		return maxarea;
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
    containerareawater m = new  containerareawater();
     m. maxArea(myArray);
   // System.out.println()
  
 }
			

	 
	 }

