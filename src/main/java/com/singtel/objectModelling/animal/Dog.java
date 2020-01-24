package com.singtel.objectModelling.animal;

public class Dog extends Animal {
	
	private final String dogSays = "Wooof, Wooof";
	
	public Dog() {
		addCharacteristics(walkKey);
		addCharacteristics(swimKey);
	}
	
	public void Says() {
		System.out.println(dogSays);
	}
}
