package com.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class showWordsInDecOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Map<String, Integer> fileData = new HashMap<String, Integer>();
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\short.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] split = line.split("\\s");
				for (String sp : split) {
					if (fileData.get(sp) != null) {
						fileData.put(sp, fileData.get(sp) + 1);
					} else
						fileData.put(sp, 1);
				}
			}
			ArrayList<Entry<String, Integer>> sortedList = new ArrayList<Entry<String, Integer>>(
					fileData.entrySet());
			Collections.sort(sortedList, new Compare1());
			System.out.println(sortedList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Compare1 implements Comparator<Map.Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getValue() - o2.getValue();
	}

}
