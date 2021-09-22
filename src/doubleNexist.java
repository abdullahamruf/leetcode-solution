import java.util.Scanner;

public class doubleNexist {
	 public boolean checkIfExist(int[] arr) {
		   for(int i=0;i<arr.length;i++){

		        for(int j=0;j<arr.length;j++){
		            if(arr[i]==0 && i==j){
		               break;
		            }
		            if(arr[i]==arr[j]*2){
		                return true;
		            }
		        }
		    }
		    return false;
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
		    doubleNexist m = new doubleNexist();
		    m. checkIfExist(myArray);
				
				   
				}
			   
			}

