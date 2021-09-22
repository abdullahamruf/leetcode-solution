import java.util.ArrayList;
import java.util.Scanner;

public class duplicatezeroes {
	   public void duplicateZeros(int[] arr) {
	        ArrayList<Integer> l = new ArrayList<>();
	        int n = arr.length;
	        int count=1;
	        for(int i=0;i<n;i++){
	            if(arr[i]==0){
	                l.add(0);
	                l.add(0);
	            }
	            else{
	                l.add(arr[i]);   
	            }
	        for(int j=0;j<n;j++){
	            arr[i]=l.get(j);
	          //  System.out.println(arr[j]);
	        }
	        }
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
			    duplicatezeroes  m = new duplicatezeroes ();
			    m.  duplicateZeros(myArray);
					
					   
					}

}
