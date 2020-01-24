package com.singtel.objectModelling.bird;

import com.singtel.objectModelling.animal.Animal;

public class Chiken extends Animal implements IBird {

	private boolean isMale;
	
	private final String chikenSays = "Cluck, Cluck";
	private final String roosterSays = "Cock-a-doddle-doo";
	
	public boolean isMale() {
		return isMale;
	}
	
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public Chiken(boolean isMale) {
		setMale(isMale);
		addCharacteristics(walkKey);
		addCharacteristics(singKey);
		
	}
	
	@Override
	public void fly() {
		System.out.println(nonFlyWord);
	}

	@Override
	public void sing() {
		System.out.println(isMale? roosterSays: chikenSays);

	}

}
