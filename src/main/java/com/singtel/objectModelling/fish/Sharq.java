package com.singtel.objectModelling.fish;

import com.singtel.objectModelling.animal.Animal;

public class Sharq extends Animal implements IFish {

	public Sharq() {
		addCharacteristics(swimKey);
	}
	
	@Override
	public String getColour() {
		return "grey";
	}

	@Override
	public String getFishCharacteristics() {
		return "They are large and they eat other fishes";
	}
}
