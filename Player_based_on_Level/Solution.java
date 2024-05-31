package Player_based_on_Level;

import java.util.Scanner;

public class Solution {
	
	public static int findPointsForGivenSkill(Player[] obj, String skill)
	{
		int sum=0;
		for(Player x: obj)
		{
			if(x.getSkill().equals(skill))
			{
				sum=sum+x.getPoints();
			}
		}
		return sum;
	}
	
	public static Player getPlayerBasedOnLevel(String level, String skill, Player[] obj)
	{
		for(Player x : obj)
		{
			if(x.getLevel().equals(level) && x.getSkill().equals(skill) && x.getPoints()>=20)
			{
				return x;
			}
		}
		return null;
	}
	
	public static void main(String args[])
	{
		Player[] obj= new Player[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;++i)
		{
			obj[i]= new Player();
			obj[i].setPlayerId(sc.nextInt());
			sc.nextLine();
			obj[i].setSkill(sc.nextLine());
			obj[i].setLevel(sc.nextLine());
			obj[i].setPoints(sc.nextInt());
		}
		sc.nextLine();
		String skill=sc.nextLine();
		String level = sc.nextLine();
		sc.close();
		
		int a= findPointsForGivenSkill(obj, skill);
		if(a>0)
		{
			System.out.println(a);
		}
		else {
			System.out.println("The given Skill is not available");
		}
		
		Player obj1= getPlayerBasedOnLevel(level, skill, obj);
		if(obj1 == null)
		{
			System.out.println("No player is available with specified level, skill and eligibility points");
		}
		else
		{
			System.out.println(obj1.getPlayerId());
		}
		
	}

}