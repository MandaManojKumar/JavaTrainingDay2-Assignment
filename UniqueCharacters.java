
import java.util.*;
public class UniqueCharacters {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder result = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			int temp=0;
			for(int j=0;j<i;j++) {
				if(input.charAt(i)==input.charAt(j)) {
					temp=1;
					break;
				}
			}
			if(temp==0) {
				result.append(input.charAt(i));

			}
		}
		 System.out.println("Unique characters: " + result.toString());
	}
}
