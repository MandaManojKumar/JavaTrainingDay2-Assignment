import java.util.*;

public class VowelsConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		input=input.toLowerCase();
		int countv=0;
		int countc=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countv++;
			}
			else {
				countc++;
			}
			}
		}

		System.out.println("Vowels:"+countv);
		System.out.println("Consonants:"+countc);
		
	}

}
