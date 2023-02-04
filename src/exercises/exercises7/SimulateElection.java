package exercises.exercises7;

public class SimulateElection {
	
	
	
	public static void main(String[] args) {
		
		Candidate Biden = new Candidate("Biden", "Democratic", 0);
		Candidate Trump = new Candidate("Trump", "Republican", 0);

		State California = new State("California", 54, 25000000, 38.0 );
		State Texas = new State("Texas", 40, 11000000, 52.0);
		State Florida = new State("Florida", 31, 11000000, 53.0);
		State New_York = new State("New York", 27, 8000000, 39.0);
		
		
//		California.addStateResults("CA");
//		Texas.addStateResults("TX");
//		Florida.addStateResults("FL");
//		New_York.addStateResults("NY");

		
		

		if (California.simStateResults("CA")==true) {
			Biden.addEV(California.getEv());
		}
		else {
			Trump.addEV(California.getEv());
		}
		
		if (Texas.simStateResults("TX")==true) {
			Biden.addEV(Texas.getEv());
		}
		else {
			Trump.addEV(Texas.getEv());
		}
		
		if (Florida.simStateResults("FL")==true) {
			Biden.addEV(Florida.getEv());
		}
		else {
			Trump.addEV(Florida.getEv());
		}
		
		if (New_York.simStateResults("NY")==true) {
			Biden.addEV(New_York.getEv());
		}
		else {
			Trump.addEV(New_York.getEv());
		}
		
				
		System.out.println(Biden.getCandidateEv());
		System.out.println(Trump.getCandidateEv());

	}

}
