package com.singtel.objectModelling.bird;

import com.singtel.objectModelling.animal.Animal;

public class Duck extends Animal implements IBird {

	private final String duckSays = "Quack, Quack";
	public Duck() {
		
		addCharacteristics(walkKey);
		addCharacteristics(swimKey);
	}
	@Override
	public void fly() {
		System.out.println(flyWord);

	}

	@Override
	public void sing() {
		System.out.println(duckSays);

	}

}
