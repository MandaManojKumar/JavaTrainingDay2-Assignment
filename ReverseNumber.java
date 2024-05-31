import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder result=new StringBuilder();
		
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			if(Character.isDigit(ch)) {
				result.append(ch);
			}
		}
		System.out.println(result.toString());
		
	}

}
