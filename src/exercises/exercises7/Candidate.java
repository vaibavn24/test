package exercises.exercises7;

public class Candidate {

	// has-a's
	
	// name String
	// Electoral Votes int
	// party String
	
	private String candidate, party;
	private int ev;
	
	// constructor
	public Candidate(String candidate, String party, int ev) {
		this.candidate = candidate;
		this.party = party;
		this.ev = ev;
	}
	
	public int addEV(int EV) {				
		return this.ev = this.ev + EV;
	}
	
	public String getParty() {
		return this.party;
	}

	public int getCandidateEv() {
		return this.ev;
	}
	
	
	
	
	
}
