package p3;

public class p3calculate {

	/**
	 * @param args
	 */
	long pf;
	public p3calculate(long num) {
		// TODO Auto-generated method stub

		//starting out with 2 as divisor as all #s divisible by 1
		divPossible(num, 2);
		System.out.println("The largest prime factor is "+pf);
	}

	public void divPossible(long num, long div){
		while(num!=1){


			if (num%div==0){
				num=num/div;
				pf=div;
				div=2;
			}
			else{
				div++;	

			}
		}

	}

}
