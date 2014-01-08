package p4;

import java.util.Stack;

public class p4calculate {
	int largestPal;
	
	public p4calculate(){
	
		largestPal=0;
		
	}
	public int findLargestPal(){
		for(int i=101; i<999; i++){
			for(int j=101; j<999; j++){
				int prod=i*j;
				int revProd=reverseInt(prod);
				if(isPal(prod, revProd)&&prod>largestPal
						&&lastDigit(prod)!=0){
					largestPal=prod;
				}
				
			}
		}
		return largestPal;
	}
	
	public int reverseInt(int x){
		
		int rev=0;
		while(x!=0){
			rev*=10;
			rev+=(x%10);
			x/=10;
		}
		return rev;
	}
	
	public boolean isPal(int x, int y){
		
		Stack s1=addToStack(x);
		Stack s2=addToStack(y);
		while(!s1.isEmpty()&&!s2.isEmpty()){
			if(s1.pop()!=s2.pop()){
				return false;
			}
		}
		return true;
	}

	
	public Stack addToStack(int x){
		Stack mystack=new Stack();
		while (x != 0) {
		
		    mystack.push(x%10);
		    x/=10;
			
		}
		return mystack;
		
	}
	
	/*because i need a way to make sure the last digit isn't
	0 since otherwise it gets messed up in the reversing */
	public int lastDigit(int x){
		return x%10;
		
	}
}
