import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input=input.toLowerCase();
		StringBuilder result = new StringBuilder();
		
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			result.append(ch);
		}
		 System.out.println("Unique characters: " + result.toString());

	}

}
