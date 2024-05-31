import java.util.*;

public class LastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder result=new StringBuilder();
		String[] words=input.split("\\s+");
		for(String word:words) {
		for(int i=word.length()-1;i>=0;i--) {
			char ch=word.charAt(i);
			if(Character.isLetter(ch)) {
				result.append(ch);
				break;
			}
		}
		}
		System.out.println(result.toString());
	}

}
