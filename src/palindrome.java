
public class palindrome {
	public static void main(String args[]){  
		int summ=0;
		int n1=88;
		String sI = Integer.toString(n1);
		System.out.println("maruf"); 
		for (int j =0 ;j< sI.length();j++) {
			System.out.println(sI.charAt(j));
			int y=sI.charAt(j);
			summ=summ+ y;
		//int a = Integer.parseInt(String.valueOf(j));
		
		//System.out.println(a);
		}
		System.out.println(summ);
		 
		  int r,sum=0,temp;    
		  int n=454; 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  


