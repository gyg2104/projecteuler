package p2;

public class p2main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evenSum=0;
		int curr=1;
		int last=0;
		while(curr<4000000 ){
			if(curr%2==0){
				evenSum+=curr;
			}
			int i=last;
			last=curr;
			curr+=i;
			
		}
		
		System.out.println("The sum is "+evenSum);
	}

	

}


