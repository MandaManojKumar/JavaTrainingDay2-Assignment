import java.util.*;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int sqrt=(int) Math.sqrt(input);
		if(sqrt*sqrt==input) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}

	}

}
