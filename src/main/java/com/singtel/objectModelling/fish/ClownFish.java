package com.singtel.objectModelling.fish;

import com.singtel.objectModelling.animal.Animal;

public class ClownFish extends Animal implements IFish {

	public ClownFish() {
		addCharacteristics(swimKey);
	}
	
	@Override
	public String getColour() {
		return "orange";
	}

	@Override
	public String getFishCharacteristics() {
		return "They are colorful and small they also make jokes";
	}

}
