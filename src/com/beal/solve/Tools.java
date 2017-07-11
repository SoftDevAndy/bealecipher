package com.beal.solve;

import java.util.HashMap;
import java.util.TreeMap;

public class Tools {
	
	TreeMap<Integer,Integer> FrequencyMapToSortedTree(HashMap<Integer,Integer> frequencyMap){
		
		ValueComparator vc = new ValueComparator(frequencyMap);
		TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(vc);
		
		sortedMap.putAll(frequencyMap);
		
		return sortedMap;
	}
}
