package com.singtel.objectModelling.animal;

public class Cat extends Animal {

private final String catSays = "Meow";
	
	public Cat() {
		addCharacteristics(walkKey);
		addCharacteristics(swimKey);
	}
	
	public void Says() {
		System.out.println(catSays);
	}
}
