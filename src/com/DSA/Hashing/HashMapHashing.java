package com.DSA.Hashing;
import java.util.Map;
import java.util.HashMap;
public class HashMapHashing {

	public static void main(String[] args) {
		int[] array= {1,7,4,8,2,7,7,8,1};
		frequency(array);
		
	}
	public static void frequency(int arr[]) {
		Map<Long,Integer> map = new HashMap<>();
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey((long)arr[i])) {
				map.put((long)arr[i], map.get((long)arr[i])+1);
			}else {
				map.put((long)arr[i], 1);
			}
		}
		Map.Entry<Long, Integer> maxEntry = null;
		for(Map.Entry<Long, Integer> entry: map.entrySet()) {
			if(maxEntry ==null ||  entry.getValue()> maxEntry.getValue()) {
				maxEntry = entry;
			}
			System.out.println("Number :"+entry.getKey()+" Count :"+entry.getValue());
		}
		System.out.println("Max Value entry : Key :"+maxEntry.getKey()+" Count :"+maxEntry.getValue());
	}
}
