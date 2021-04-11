//Michael Dobrzanski

public class ManagersCrossing {
	
	public static boolean isMoveOkay(int boatBefore, int managerABefore, int managerBBefore, 
			int managerCBefore, int engineerABefore, int engineerBBefore, int engineerCBefore, 
			int boatAfter, int managerAAfter, int managerBAfter, int managerCAfter, 
			int engineerAAfter, int engineerBAfter, int engineerCAfter) {
		int numMoving = 0;
		
		//ensure all positions are 1 or 2
		int []positions = {boatBefore, managerABefore, managerBBefore, 
			managerCBefore, engineerABefore, engineerBBefore, engineerCBefore, 
			boatAfter, managerAAfter, managerBAfter, managerCAfter, 
			engineerAAfter, engineerBAfter, engineerCAfter};
		for(int i: positions) {
		if(i != 1 && i != 2) {
			System.out.println("All positions must be 1 or 2!");
			return false;
		}
		}
		//managerA moving
		if(managerABefore != managerAAfter) {
			// can managerA move? (boat has to be on the same side)
			if(managerABefore != boatBefore) {
			System.out.println("You may not move a person who is not with the boat!");
			return false;
			}
			numMoving++; // numMoving += 1;
		}

		//managerB moving
		if(managerBBefore != managerBAfter) {
			// can managerB move? (boat has to be on the same side)
			if(managerBBefore != boatBefore) {
			System.out.println("You may not move a person who is not with the boat!");
			return false;
			}
			numMoving++; // numMoving += 1;
		}
		//managerC moving
		if(managerCBefore != managerCAfter) {
			// can managerC move? (boat has to be on the same side)
			if(managerCBefore != boatBefore) {
			System.out.println("You may not move a person who is not with the boat!");
			return false;
			}
			numMoving++; // numMoving += 1;
		}
		// engineerA moving
		if(engineerABefore != engineerAAfter) {
			// can engineerA move? (boat has to be on the same side)
			if(engineerABefore != boatBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numMoving++; // numMoving += 1;
		}
		// engineerB moving
		if(engineerBBefore != engineerBAfter) {
			// can engineerB move? (boat has to be on the same side)
			if(engineerBBefore != boatBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numMoving++; // numMoving += 1;
		}
		// engineerC moving
		if(engineerCBefore != engineerCAfter) {
			// can engineerC move? (boat has to be on the same side)
			if(engineerCBefore != boatBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numMoving++; // numMoving += 1;
		}
		//is the boat moving?
		if(boatBefore == boatAfter) {
			System.out.println("The boat must move!");
			return false;
		}
		// no more than one or two people moving
		if(numMoving != 1 && numMoving != 2) {
			System.out.println("You must move one or two people!");
			return false;
		}
		// ensure managerA will not recruit engineerB
		if(managerAAfter == engineerBAfter && engineerBAfter != managerBAfter) {
			System.out.println("Manager A would try to recruit someone!");
			return false;
		}
		// ensure managerA will not recruit engineerC
		if(managerAAfter == engineerCAfter && engineerCAfter != managerCAfter) {
			System.out.println("Manager A would try to recruit someone!");
			return false;
		}
		// ensure managerB will not recruit engineerA
		if(managerBAfter == engineerAAfter && engineerAAfter != managerAAfter) {
			System.out.println("Manager B would try to recruit someone!");
			return false;
		}
		// ensure managerB will not recruit engineerC
		if(managerBAfter == engineerCAfter && engineerCAfter != managerCAfter) {
			System.out.println("Manager B would try to recruit someone!");
			return false;
		}
		// ensure managerC will not recruit engineerA
		if(managerCAfter == engineerAAfter && engineerAAfter != managerAAfter) {
			System.out.println("Manager C would try to recruit someone!");
			return false;
		}
		// ensure managerC will not recruit engineerB
		if(managerCAfter == engineerBAfter && engineerBAfter != managerBAfter) {
			System.out.println("Manager C would try to recruit someone!");
			return false;
		}
		if(boatAfter == 2 && managerAAfter == 2 && managerBAfter == 2 && 
		   managerCAfter == 2 && engineerAAfter == 2 && engineerBAfter == 2 && engineerCAfter == 2) {
		    System.out.println("You solved the puzzle!");
		    return true;}
		return true;
	}
}