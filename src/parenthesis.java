import java.util.HashMap;
import java.util.Stack;

public class parenthesis {
	 public boolean isValid(String s) {
	        
		 Stack<Character> stack = new Stack<>();
	        
	        for(char c : s.toCharArray()){
	            if(c == '[' || c == '{' || c == '('){
	             Character m=  stack.push(c);
	                System.out.println(m);
	            }
	                else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
	                    stack.pop();
	                }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
	                    stack.pop();
	                }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
	                    stack.pop();
	                }
	                else {
	                	return false;
	                }
	           
	        }
	        return stack.isEmpty();
		 
		
	        
	    
	     
	 }
	 public static void main(String args[]){  
			
		 parenthesis obj=new parenthesis();
				obj.isValid("{}");
				
				   
				}
}
