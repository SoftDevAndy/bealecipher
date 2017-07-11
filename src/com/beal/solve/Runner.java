package com.beal.solve;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {

	final static int VALUES_PER_LINE = 15;
	final static int FREQ_VALUES_PER_LINE = 7;
	
    public static void main(String[] args) throws IOException { 	
    	
    	/* Variables */
    	
    	List<Integer> cipherNumbersList = new ArrayList<Integer>();
        HashMap<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
    	    	
    	CSVReader csvReader = new CSVReader();
        Printer printer = new Printer();
    	
        /* Methods */
        
        cipherNumbersList = csvReader.readCSV("paper1_exactlocation.csv");
        
        for(int currentKey : cipherNumbersList){
        	
        	if(frequencyMap.containsKey(currentKey))
        		frequencyMap.put(currentKey, frequencyMap.get(currentKey) + 1);    	
        	else
        		frequencyMap.put(currentKey, 1); 
        }
        
        printer.PrintFrequencyHashMap(frequencyMap, FREQ_VALUES_PER_LINE);
        
    }// main

}// class