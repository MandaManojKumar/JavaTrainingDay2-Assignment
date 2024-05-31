package Sim_Match_And_Sort;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution implements Comparator<Sim>{
	
	public static Sim[] matchAndSort(Sim[] obj, String search_circle, double search_rate)
	{
		ArrayList<Sim> arraylist
        = new ArrayList<Sim>();
		for(Sim x: obj)
		{
			String circle= x.getCircle();
			if(circle.equals(search_circle) && search_rate>x.getRatePerSecond())
			{
				//x.setCircle(circle2);
				//chro
				arraylist.add(x);
			}
		}
		Collections.sort(arraylist, Solution.Sor);
		Sim[] obj1=new Sim[arraylist.size()];
		obj1= arraylist.toArray(obj1);
		return obj1;
	}
	
	public static void main(String args[])
	{
		Sim obj[]=new Sim[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;++i)
		{
			obj[i]=new Sim();
			obj[i].setId(sc.nextInt());
			sc.nextLine();
			obj[i].setCompany(sc.nextLine());
			obj[i].setBalance(sc.nextDouble());
			obj[i].setRatePerSecond(sc.nextDouble());
			sc.nextLine();
			obj[i].setCircle(sc.nextLine());
		}
		
		String search_circle= sc.nextLine();
		double search_rate= sc.nextDouble();
		sc.close();
		
		Sim obj1[]=matchAndSort(obj, search_circle, search_rate);
		
		for(Sim x:obj1)
		{
			System.out.println(x.getId());
		}
		
	}

	public static Comparator<Sim> Sor = new Comparator<Sim>() {
		
		/*@Override
		public int compare(Sim o1, Sim o2) {
			// TODO Auto-generated method stub
			double rate1= o1.getRatePerSecond();
			double rate2= o2.getRatePerSecond();
			double r= Math.ceil(rate1-rate2);
			return (int)r;
		}*/
		
		@Override
	    public int compare(Sim o1, Sim o2) {
	        return Double.compare(o2.getBalance(), o1.getBalance()); // Note the order is reversed for descending
	    }
	};

	@Override
	public int compare(Sim o1, Sim o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}