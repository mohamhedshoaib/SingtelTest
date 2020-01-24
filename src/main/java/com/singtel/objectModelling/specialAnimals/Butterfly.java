package com.singtel.objectModelling.specialAnimals;

import com.singtel.objectModelling.animal.Animal;

public class Butterfly extends Animal {

	private boolean isEvolved;

	public Boolean getIsEvolved() {
		return isEvolved;
	}

	public void setIsEvolved(Boolean isEvolved) {
		this.isEvolved = isEvolved;
	}
	
	public Butterfly(boolean isEvolved) {
		setIsEvolved(isEvolved);
		
		if(getIsEvolved() == true) {
			addCharacteristics(flyKey);
			}
		else{
			addCharacteristics(walkKey);
		}
		}
}
