package p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class p5calculate {
	
	int num;
	HashMap<Integer, Integer> occurenceCount;
	
	public p5calculate(int x){
		
		num=x;
		occurenceCount=new HashMap<Integer, Integer>();
		
	}
	
	public int findLcm(){
		int lcm=1;
		for(int i=1; i<=num; i++){
			ArrayList<Integer> factors=findFactors(i);
			updateMostOccCount(factors);
		}
		for (Entry<Integer, Integer> entry : occurenceCount.entrySet()) {
			  Integer key = entry.getKey();
			  Integer value = entry.getValue();
			  int multiplied=(int) Math.pow(key,value); 
			  lcm*=multiplied;  
			}
		return lcm;
	}
	
	public void updateMostOccCount(ArrayList<Integer> list){
		
		for(int i=0; i<list.size(); i++){
			int count=Collections.frequency(list, list.get(i));
			if(!occurenceCount.containsKey(list.get(i))){	
				occurenceCount.put(list.get(i), count);
			}
			else{
				if(occurenceCount.get(list.get(i))<count){
					occurenceCount.remove(list.get(i));
					occurenceCount.put(list.get(i), count);
				}
			}
		}
	}
	
	public ArrayList<Integer> findFactors(int x){
	   ArrayList<Integer> factors = new ArrayList<Integer>();
	    for (int i=2; i<=x; i++) {
	      while (x % i == 0) {
	        factors.add(i);
	        x /= i;
	      }
	    }
	    if (x>1){
	      factors.add(x);
	    }
		return factors;
	}	

}
