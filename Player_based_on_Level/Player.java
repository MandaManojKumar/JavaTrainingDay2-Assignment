package Player_based_on_Level;

public class Player {
	
	private int playerId;
    private String skill;
    private String level;
    private int points;
    
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    public int getPlayerId() {
        return playerId;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }


}