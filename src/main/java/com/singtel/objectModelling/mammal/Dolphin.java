package com.singtel.objectModelling.mammal;

import com.singtel.objectModelling.animal.Animal;

public class Dolphin extends Animal implements IMammals {

	public Dolphin() {
		addCharacteristics(swimKey);
		addCharacteristics(walkKey);
	}
}
