package com.beal.solve;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Printer {
	
	void PrintFrequencyHashMap(HashMap<Integer,Integer> frequencyMap, int valuesperline){

		int i = 0;
		
		ValueComparator vc = new ValueComparator(frequencyMap);
		TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(vc);
				
		sortedMap.putAll(frequencyMap);		
		
		for(Map.Entry<Integer,Integer> kv : sortedMap.entrySet()){
			
			if(i % valuesperline == 0 && i != 0)
				System.out.println();
			
		    System.out.format("[%-4d] - %-8d",kv.getKey(),kv.getValue());
		    
		    i++;
		}
	}
		
	void PrintListIntegersToFile(List<Integer> list, int valuesperline, String filename) throws IOException{
		
		File file = new File(filename);
		Formatter fmt = new Formatter(file);
		
		try {
			file.createNewFile();
		} catch (Exception e) {}
	      		
		for(int i = 0; i  < list.size(); i++){
			
			if(i % valuesperline == 0 && i != 0)
				fmt.format("\n");
			
			if(i != list.size() - 1)
				fmt.format("%4d, ", list.get(i));
			else
				fmt.format("%4d", list.get(i));
			
			fmt.flush();
		}
		
		fmt.close();
	}
}
