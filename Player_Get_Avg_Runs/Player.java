package Player_Get_Avg_Runs;

public class Player {

	private int id;
	private String name;
	private int iccRank;
	private int matchesPlayed;
	private int runsScored;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getIccRank() {
		return iccRank;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public int getRunsScored() {
		return runsScored;
	}

}