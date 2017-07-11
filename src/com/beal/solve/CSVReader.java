package com.beal.solve;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	
	public List<Integer> readCSV(String filePath){
		
        BufferedReader br = null;
        String line = "";
        String cvsMarker = ",";
        
        List<Integer> csvContents = new ArrayList<Integer>();

        try {

            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {

                String[] arr = line.split(cvsMarker);

                for(String str : arr){
                	
                	int val = Integer.valueOf(str.replaceAll("\\s+",""));
                	
                	csvContents.add(Integer.valueOf(val));
                }
            }
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) {e.printStackTrace();} 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return csvContents;
	}
}
