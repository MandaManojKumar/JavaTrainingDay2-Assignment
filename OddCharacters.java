import java.util.*;

public class OddCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder result=new StringBuilder();
		for(int i=1;i<=input.length();i=i+2) {
			char ch=input.charAt(i);
			result.append(ch);
		}

		System.out.print(result.toString());
	}

}
