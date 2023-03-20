package Java;

import java.util.HashMap;
import java.util.Map;

public class FindMejorityElement {
	
	

	public static void main(String[] args) {
		int a[] = {2,3,5,2,3,6,6,2,2,2,2,2,2};
		System.out.println(majorityElement(a, 13));
	}
	
	static int majorityElement(int a[],int size){
	
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i : a) {
			Integer val = map.get(i);
			if (val==null) {
				map.put(i, 1);
			}else {
				map.put(i, val+1);	
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>size/2) {
				return entry.getKey();
			}
		}
		
		return -1;
		
		
		
	}

}
