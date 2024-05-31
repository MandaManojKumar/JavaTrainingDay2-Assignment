import java.util.Scanner;

class Player {
    public int playerId;
    public String skill;
    public String level;
    public int points;


    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}

public class PlayerGet {
    public static int findPointsForGivenSkill(Player[] players, String skill) {
        int totalPoints = 0;
        for (Player player : players) {
            if (player.skill.equalsIgnoreCase(skill)) {
                totalPoints += player.points;
            }
        }
        return totalPoints;
    }

    public static Player getPlayerBasedOnLevel(Player[] players, String level, String skill) {
        for (Player player : players) {
            if (player.level.equalsIgnoreCase(level) && player.skill.equalsIgnoreCase(skill) && player.points >= 20) {
                return player;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            int playerId = Integer.parseInt(scanner.nextLine());
            String skill = scanner.nextLine();
            String level = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());
            players[i] = new Player(playerId, skill, level, points);
        }

        String skill = scanner.nextLine();
        String level = scanner.nextLine();

        int totalPoints = findPointsForGivenSkill(players, skill);
        if (totalPoints > 0) {
            System.out.println(totalPoints);
        } else {
            System.out.println("The given Skill is not available");
        }


        Player player = getPlayerBasedOnLevel(players, level, skill);
        if (player != null) {
            System.out.println(player.playerId);
        } else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
}
