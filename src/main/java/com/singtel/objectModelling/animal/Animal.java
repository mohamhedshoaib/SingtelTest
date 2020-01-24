package com.singtel.objectModelling.animal;

import java.util.HashMap;
import java.util.Map;

public class Animal implements IAnimal{
	
	private static Map<String, Integer> characteristicsMap = new HashMap<String, Integer>();
	
	public final String walkKey = "Walk";
	public final String singKey = "Sing";
	public final String swimKey = "swim";
	public final String flyKey = "fly";
			
	public static void clearCharacteristics() {
		characteristicsMap = new HashMap<String, Integer>();
	}
	
	public static void addCharacteristics(String characteristicsKey) {
		
		int count  = characteristicsMap.containsKey(characteristicsKey) ? characteristicsMap.get(characteristicsKey): 0;	
		
		characteristicsMap.put(characteristicsKey, ++count);
	}
	
	public static Map<String, Integer> getCharacteristicsMap(){
		return characteristicsMap;
	}

	public void walk() {
		System.out.println("I am walking");
		
	}
	

}
