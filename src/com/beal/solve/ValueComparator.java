package com.beal.solve;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Integer> {
	
	Map<Integer, Integer> map;

    public ValueComparator(Map<Integer, Integer> map) {
        this.map = map;
    }
    
    public int compare(Integer a, Integer b) {
        if (map.get(a) >= map.get(b))
            return -1;
        else 
            return 1;
    }
}
