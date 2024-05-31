package Player_Get_Avg_Runs;

import java.util.Scanner;
import java.util.ArrayList;

//import Player_based_on_Level.Player;

public class Solution {
	
	public static double[] findAverageOfRuns(Player[] obj, int target)
	{
		ArrayList<Double> ar= new ArrayList<Double>();
		for(Player x: obj)
		{
			if(target<=x.getMatchesPlayed())
			{
				double a= x.getRunsScored()/x.getMatchesPlayed();
				ar.add(a);
			}
		}
		double[] arr= new double[ar.size()];
		for (int i = 0; i < ar.size(); i++) {
            arr[i] = ar.get(i);
        }
		return arr;
	}
	
	public static void main(String args[])
	{
		Player[] obj= new Player[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;++i)
		{
			obj[i]= new Player();
			obj[i].setId(sc.nextInt());
			sc.nextLine();
			obj[i].setName(sc.nextLine());
			obj[i].setIccRank(sc.nextInt());
			obj[i].setMatchesPlayed(sc.nextInt());
			obj[i].setRunsScored(sc.nextInt());
		}
		//sc.nextLine();
		int target= sc.nextInt();
		sc.close();
		
		double arr[]= findAverageOfRuns(obj, target);
		
		for(double x: arr)
		{
			if(x>=80 && x<=100)
			{
				System.out.println("Grade A");
			}
			else if(x>=50 && x<=79)
			{
				System.out.println("Grade B");
			}
			else {
				System.out.println("Grade C");
			}
		}
		
	}

}