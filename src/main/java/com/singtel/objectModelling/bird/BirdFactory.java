package com.singtel.objectModelling.bird;

import com.singtel.objectModelling.utils.FriendType;

public class BirdFactory {
	
	
	public IBird getBird(int id) {
		
		switch(id) {
		case 1:
			return new Chiken(true);
			
		case 2:
			return new Chiken(false);
			
		case 3:
			return new Parrot(FriendType.Dog);
			
		case 4:
			return new Parrot(FriendType.Cat);
			
		case 5:
			return new Parrot(FriendType.Duck);
				
		default:
			return null;
		}
		
	}

}
