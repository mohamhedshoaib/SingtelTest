package com.singtel.objectModelling.fish;

public class FishFactory {

	public IFish getFish(int id) {
		
		switch(id) {
		case 1:
			return new Sharq();
			
		case 2:
			return new ClownFish();
			
		default:
			return null;
		}
	}
}
